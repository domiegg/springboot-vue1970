
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 项目验收
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/lixiangyanshou")
public class LixiangyanshouController {
    private static final Logger logger = LoggerFactory.getLogger(LixiangyanshouController.class);

    private static final String TABLE_NAME = "lixiangyanshou";

    @Autowired
    private LixiangyanshouService lixiangyanshouService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典表
    @Autowired
    private GonggaoService gonggaoService;//公告信息
    @Autowired
    private HetongqianshuService hetongqianshuService;//合同签署
    @Autowired
    private LixiangService lixiangService;//项目立项
    @Autowired
    private LixiangGenjinService lixiangGenjinService;//项目跟进
    @Autowired
    private LixiangPingshenService lixiangPingshenService;//项目评审
    @Autowired
    private QiyeService qiyeService;//企业
    @Autowired
    private ShangjiService shangjiService;//商机
    @Autowired
    private ShangjiGenjinService shangjiGenjinService;//商机跟进
    @Autowired
    private ShangjiZhuanhuaService shangjiZhuanhuaService;//商机转化
    @Autowired
    private XiansuoService xiansuoService;//线索
    @Autowired
    private XiansuoGenjinService xiansuoGenjinService;//线索跟进
    @Autowired
    private XiansuoZhuanhuaService xiansuoZhuanhuaService;//线索转化
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private ZhaobiaoService zhaobiaoService;//招标
    @Autowired
    private ZhaobiaoToubiaoService zhaobiaoToubiaoService;//投标
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("企业".equals(role))
            params.put("qiyeId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = lixiangyanshouService.queryPage(params);

        //字典表数据转换
        List<LixiangyanshouView> list =(List<LixiangyanshouView>)page.getList();
        for(LixiangyanshouView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        LixiangyanshouEntity lixiangyanshou = lixiangyanshouService.selectById(id);
        if(lixiangyanshou !=null){
            //entity转view
            LixiangyanshouView view = new LixiangyanshouView();
            BeanUtils.copyProperties( lixiangyanshou , view );//把实体数据重构到view中
            //级联表 项目立项
            //级联表
            LixiangEntity lixiang = lixiangService.selectById(lixiangyanshou.getLixiangId());
            if(lixiang != null){
            BeanUtils.copyProperties( lixiang , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setLixiangId(lixiang.getId());
            }
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(lixiangyanshou.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody LixiangyanshouEntity lixiangyanshou, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,lixiangyanshou:{}",this.getClass().getName(),lixiangyanshou.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            lixiangyanshou.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<LixiangyanshouEntity> queryWrapper = new EntityWrapper<LixiangyanshouEntity>()
            .eq("lixiang_id", lixiangyanshou.getLixiangId())
            .eq("yonghu_id", lixiangyanshou.getYonghuId())
            .eq("lixiangyanshou_name", lixiangyanshou.getLixiangyanshouName())
            .eq("lixiangyanshou_address", lixiangyanshou.getLixiangyanshouAddress())
            .eq("lixiangyanshou_jieguo", lixiangyanshou.getLixiangyanshouJieguo())
            .in("lixiangyanshou_yesno_types", new Integer[]{1,2})
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LixiangyanshouEntity lixiangyanshouEntity = lixiangyanshouService.selectOne(queryWrapper);
        if(lixiangyanshouEntity==null){
            lixiangyanshou.setInsertTime(new Date());
            lixiangyanshou.setLixiangyanshouYesnoTypes(1);
            lixiangyanshou.setCreateTime(new Date());
            lixiangyanshouService.insert(lixiangyanshou);
            return R.ok();
        }else {
            if(lixiangyanshouEntity.getLixiangyanshouYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(lixiangyanshouEntity.getLixiangyanshouYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody LixiangyanshouEntity lixiangyanshou, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,lixiangyanshou:{}",this.getClass().getName(),lixiangyanshou.toString());
        LixiangyanshouEntity oldLixiangyanshouEntity = lixiangyanshouService.selectById(lixiangyanshou.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            lixiangyanshou.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(lixiangyanshou.getLixiangyanshouFile()) || "null".equals(lixiangyanshou.getLixiangyanshouFile())){
                lixiangyanshou.setLixiangyanshouFile(null);
        }
        if("".equals(lixiangyanshou.getLixiangyanshouContent()) || "null".equals(lixiangyanshou.getLixiangyanshouContent())){
                lixiangyanshou.setLixiangyanshouContent(null);
        }
        if("".equals(lixiangyanshou.getLixiangyanshouYesnoText()) || "null".equals(lixiangyanshou.getLixiangyanshouYesnoText())){
                lixiangyanshou.setLixiangyanshouYesnoText(null);
        }

            lixiangyanshouService.updateById(lixiangyanshou);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody LixiangyanshouEntity lixiangyanshouEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,lixiangyanshouEntity:{}",this.getClass().getName(),lixiangyanshouEntity.toString());

        LixiangyanshouEntity oldLixiangyanshou = lixiangyanshouService.selectById(lixiangyanshouEntity.getId());//查询原先数据

//        if(lixiangyanshouEntity.getLixiangyanshouYesnoTypes() == 2){//通过
//            lixiangyanshouEntity.setLixiangyanshouTypes();
//        }else if(lixiangyanshouEntity.getLixiangyanshouYesnoTypes() == 3){//拒绝
//            lixiangyanshouEntity.setLixiangyanshouTypes();
//        }
        lixiangyanshouEntity.setLixiangyanshouShenheTime(new Date());//审核时间
        lixiangyanshouService.updateById(lixiangyanshouEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<LixiangyanshouEntity> oldLixiangyanshouList =lixiangyanshouService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        lixiangyanshouService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<LixiangyanshouEntity> lixiangyanshouList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            LixiangyanshouEntity lixiangyanshouEntity = new LixiangyanshouEntity();
//                            lixiangyanshouEntity.setLixiangId(Integer.valueOf(data.get(0)));   //立项项目 要改的
//                            lixiangyanshouEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            lixiangyanshouEntity.setLixiangyanshouUuidNumber(data.get(0));                    //项目验收编号 要改的
//                            lixiangyanshouEntity.setLixiangyanshouName(data.get(0));                    //验收标题 要改的
//                            lixiangyanshouEntity.setLixiangyanshouFile(data.get(0));                    //项目验收附件 要改的
//                            lixiangyanshouEntity.setLixiangyanshouAddress(data.get(0));                    //验收地点 要改的
//                            lixiangyanshouEntity.setLixiangyanshouTime(sdf.parse(data.get(0)));          //验收时间 要改的
//                            lixiangyanshouEntity.setLixiangyanshouContent("");//详情和图片
//                            lixiangyanshouEntity.setLixiangyanshouJieguo(data.get(0));                    //验收结果 要改的
//                            lixiangyanshouEntity.setInsertTime(date);//时间
//                            lixiangyanshouEntity.setLixiangyanshouYesnoTypes(Integer.valueOf(data.get(0)));   //审核状态 要改的
//                            lixiangyanshouEntity.setLixiangyanshouYesnoText(data.get(0));                    //审核意见 要改的
//                            lixiangyanshouEntity.setLixiangyanshouShenheTime(sdf.parse(data.get(0)));          //审核时间 要改的
//                            lixiangyanshouEntity.setCreateTime(date);//时间
                            lixiangyanshouList.add(lixiangyanshouEntity);


                            //把要查询是否重复的字段放入map中
                                //项目验收编号
                                if(seachFields.containsKey("lixiangyanshouUuidNumber")){
                                    List<String> lixiangyanshouUuidNumber = seachFields.get("lixiangyanshouUuidNumber");
                                    lixiangyanshouUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> lixiangyanshouUuidNumber = new ArrayList<>();
                                    lixiangyanshouUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("lixiangyanshouUuidNumber",lixiangyanshouUuidNumber);
                                }
                        }

                        //查询是否重复
                         //项目验收编号
                        List<LixiangyanshouEntity> lixiangyanshouEntities_lixiangyanshouUuidNumber = lixiangyanshouService.selectList(new EntityWrapper<LixiangyanshouEntity>().in("lixiangyanshou_uuid_number", seachFields.get("lixiangyanshouUuidNumber")));
                        if(lixiangyanshouEntities_lixiangyanshouUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(LixiangyanshouEntity s:lixiangyanshouEntities_lixiangyanshouUuidNumber){
                                repeatFields.add(s.getLixiangyanshouUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [项目验收编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        lixiangyanshouService.insertBatch(lixiangyanshouList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




}

