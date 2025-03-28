
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
 * 项目评审
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/lixiangPingshen")
public class LixiangPingshenController {
    private static final Logger logger = LoggerFactory.getLogger(LixiangPingshenController.class);

    private static final String TABLE_NAME = "lixiangPingshen";

    @Autowired
    private LixiangPingshenService lixiangPingshenService;


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
    private LixiangyanshouService lixiangyanshouService;//项目验收
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
        PageUtils page = lixiangPingshenService.queryPage(params);

        //字典表数据转换
        List<LixiangPingshenView> list =(List<LixiangPingshenView>)page.getList();
        for(LixiangPingshenView c:list){
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
        LixiangPingshenEntity lixiangPingshen = lixiangPingshenService.selectById(id);
        if(lixiangPingshen !=null){
            //entity转view
            LixiangPingshenView view = new LixiangPingshenView();
            BeanUtils.copyProperties( lixiangPingshen , view );//把实体数据重构到view中
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(lixiangPingshen.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //级联表 项目立项
            //级联表
            LixiangEntity lixiang = lixiangService.selectById(lixiangPingshen.getLixiangId());
            if(lixiang != null){
            BeanUtils.copyProperties( lixiang , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setLixiangId(lixiang.getId());
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
    public R save(@RequestBody LixiangPingshenEntity lixiangPingshen, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,lixiangPingshen:{}",this.getClass().getName(),lixiangPingshen.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            lixiangPingshen.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<LixiangPingshenEntity> queryWrapper = new EntityWrapper<LixiangPingshenEntity>()
            .eq("yonghu_id", lixiangPingshen.getYonghuId())
            .eq("lixiang_id", lixiangPingshen.getLixiangId())
            .eq("lixiang_pingshen_name", lixiangPingshen.getLixiangPingshenName())
            .eq("lixiang_pingshen_types", lixiangPingshen.getLixiangPingshenTypes())
            .in("lixiang_pingshen_yesno_types", new Integer[]{1,2})
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LixiangPingshenEntity lixiangPingshenEntity = lixiangPingshenService.selectOne(queryWrapper);
        if(lixiangPingshenEntity==null){
            lixiangPingshen.setInsertTime(new Date());
            lixiangPingshen.setLixiangPingshenYesnoTypes(1);
            lixiangPingshen.setCreateTime(new Date());
            lixiangPingshenService.insert(lixiangPingshen);
            return R.ok();
        }else {
            if(lixiangPingshenEntity.getLixiangPingshenYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(lixiangPingshenEntity.getLixiangPingshenYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody LixiangPingshenEntity lixiangPingshen, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,lixiangPingshen:{}",this.getClass().getName(),lixiangPingshen.toString());
        LixiangPingshenEntity oldLixiangPingshenEntity = lixiangPingshenService.selectById(lixiangPingshen.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            lixiangPingshen.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(lixiangPingshen.getLixiangPingshenFile()) || "null".equals(lixiangPingshen.getLixiangPingshenFile())){
                lixiangPingshen.setLixiangPingshenFile(null);
        }
        if("".equals(lixiangPingshen.getLixiangPingshenContent()) || "null".equals(lixiangPingshen.getLixiangPingshenContent())){
                lixiangPingshen.setLixiangPingshenContent(null);
        }
        if("".equals(lixiangPingshen.getLixiangPingshenYesnoText()) || "null".equals(lixiangPingshen.getLixiangPingshenYesnoText())){
                lixiangPingshen.setLixiangPingshenYesnoText(null);
        }

            lixiangPingshenService.updateById(lixiangPingshen);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody LixiangPingshenEntity lixiangPingshenEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,lixiangPingshenEntity:{}",this.getClass().getName(),lixiangPingshenEntity.toString());

        LixiangPingshenEntity oldLixiangPingshen = lixiangPingshenService.selectById(lixiangPingshenEntity.getId());//查询原先数据

//        if(lixiangPingshenEntity.getLixiangPingshenYesnoTypes() == 2){//通过
//            lixiangPingshenEntity.setLixiangPingshenTypes();
//        }else if(lixiangPingshenEntity.getLixiangPingshenYesnoTypes() == 3){//拒绝
//            lixiangPingshenEntity.setLixiangPingshenTypes();
//        }
        lixiangPingshenEntity.setLixiangPingshenShenheTime(new Date());//审核时间
        lixiangPingshenService.updateById(lixiangPingshenEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<LixiangPingshenEntity> oldLixiangPingshenList =lixiangPingshenService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        lixiangPingshenService.deleteBatchIds(Arrays.asList(ids));

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
            List<LixiangPingshenEntity> lixiangPingshenList = new ArrayList<>();//上传的东西
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
                            LixiangPingshenEntity lixiangPingshenEntity = new LixiangPingshenEntity();
//                            lixiangPingshenEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            lixiangPingshenEntity.setLixiangId(Integer.valueOf(data.get(0)));   //项目 要改的
//                            lixiangPingshenEntity.setLixiangPingshenUuidNumber(data.get(0));                    //项目评审编号 要改的
//                            lixiangPingshenEntity.setLixiangPingshenName(data.get(0));                    //项目评审标题 要改的
//                            lixiangPingshenEntity.setLixiangPingshenTypes(Integer.valueOf(data.get(0)));   //项目评审类型 要改的
//                            lixiangPingshenEntity.setLixiangPingshenFile(data.get(0));                    //评审附件 要改的
//                            lixiangPingshenEntity.setLixiangPingshenContent("");//详情和图片
//                            lixiangPingshenEntity.setInsertTime(date);//时间
//                            lixiangPingshenEntity.setLixiangPingshenYesnoTypes(Integer.valueOf(data.get(0)));   //项目评审状态 要改的
//                            lixiangPingshenEntity.setLixiangPingshenYesnoText(data.get(0));                    //审核意见 要改的
//                            lixiangPingshenEntity.setLixiangPingshenShenheTime(sdf.parse(data.get(0)));          //审核时间 要改的
//                            lixiangPingshenEntity.setCreateTime(date);//时间
                            lixiangPingshenList.add(lixiangPingshenEntity);


                            //把要查询是否重复的字段放入map中
                                //项目评审编号
                                if(seachFields.containsKey("lixiangPingshenUuidNumber")){
                                    List<String> lixiangPingshenUuidNumber = seachFields.get("lixiangPingshenUuidNumber");
                                    lixiangPingshenUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> lixiangPingshenUuidNumber = new ArrayList<>();
                                    lixiangPingshenUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("lixiangPingshenUuidNumber",lixiangPingshenUuidNumber);
                                }
                        }

                        //查询是否重复
                         //项目评审编号
                        List<LixiangPingshenEntity> lixiangPingshenEntities_lixiangPingshenUuidNumber = lixiangPingshenService.selectList(new EntityWrapper<LixiangPingshenEntity>().in("lixiang_pingshen_uuid_number", seachFields.get("lixiangPingshenUuidNumber")));
                        if(lixiangPingshenEntities_lixiangPingshenUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(LixiangPingshenEntity s:lixiangPingshenEntities_lixiangPingshenUuidNumber){
                                repeatFields.add(s.getLixiangPingshenUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [项目评审编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        lixiangPingshenService.insertBatch(lixiangPingshenList);
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

