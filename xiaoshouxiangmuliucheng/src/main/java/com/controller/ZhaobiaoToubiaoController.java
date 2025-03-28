
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
 * 投标
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhaobiaoToubiao")
public class ZhaobiaoToubiaoController {
    private static final Logger logger = LoggerFactory.getLogger(ZhaobiaoToubiaoController.class);

    private static final String TABLE_NAME = "zhaobiaoToubiao";

    @Autowired
    private ZhaobiaoToubiaoService zhaobiaoToubiaoService;


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
        PageUtils page = zhaobiaoToubiaoService.queryPage(params);

        //字典表数据转换
        List<ZhaobiaoToubiaoView> list =(List<ZhaobiaoToubiaoView>)page.getList();
        for(ZhaobiaoToubiaoView c:list){
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
        ZhaobiaoToubiaoEntity zhaobiaoToubiao = zhaobiaoToubiaoService.selectById(id);
        if(zhaobiaoToubiao !=null){
            //entity转view
            ZhaobiaoToubiaoView view = new ZhaobiaoToubiaoView();
            BeanUtils.copyProperties( zhaobiaoToubiao , view );//把实体数据重构到view中
            //级联表 招标
            //级联表
            ZhaobiaoEntity zhaobiao = zhaobiaoService.selectById(zhaobiaoToubiao.getZhaobiaoId());
            if(zhaobiao != null){
            BeanUtils.copyProperties( zhaobiao , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setZhaobiaoId(zhaobiao.getId());
            }
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(zhaobiaoToubiao.getYonghuId());
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
    public R save(@RequestBody ZhaobiaoToubiaoEntity zhaobiaoToubiao, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhaobiaoToubiao:{}",this.getClass().getName(),zhaobiaoToubiao.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            zhaobiaoToubiao.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ZhaobiaoToubiaoEntity> queryWrapper = new EntityWrapper<ZhaobiaoToubiaoEntity>()
            .eq("zhaobiao_id", zhaobiaoToubiao.getZhaobiaoId())
            .eq("yonghu_id", zhaobiaoToubiao.getYonghuId())
            .in("zhaobiao_toubiao_yesno_types", new Integer[]{1,2})
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhaobiaoToubiaoEntity zhaobiaoToubiaoEntity = zhaobiaoToubiaoService.selectOne(queryWrapper);
        if(zhaobiaoToubiaoEntity==null){
            zhaobiaoToubiao.setInsertTime(new Date());
            zhaobiaoToubiao.setZhaobiaoToubiaoYesnoTypes(1);
            zhaobiaoToubiao.setCreateTime(new Date());
            zhaobiaoToubiaoService.insert(zhaobiaoToubiao);
            return R.ok();
        }else {
            if(zhaobiaoToubiaoEntity.getZhaobiaoToubiaoYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(zhaobiaoToubiaoEntity.getZhaobiaoToubiaoYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhaobiaoToubiaoEntity zhaobiaoToubiao, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,zhaobiaoToubiao:{}",this.getClass().getName(),zhaobiaoToubiao.toString());
        ZhaobiaoToubiaoEntity oldZhaobiaoToubiaoEntity = zhaobiaoToubiaoService.selectById(zhaobiaoToubiao.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            zhaobiaoToubiao.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(zhaobiaoToubiao.getZhaobiaoToubiaoFile()) || "null".equals(zhaobiaoToubiao.getZhaobiaoToubiaoFile())){
                zhaobiaoToubiao.setZhaobiaoToubiaoFile(null);
        }
        if("".equals(zhaobiaoToubiao.getZhaobiaoToubiaoContent()) || "null".equals(zhaobiaoToubiao.getZhaobiaoToubiaoContent())){
                zhaobiaoToubiao.setZhaobiaoToubiaoContent(null);
        }
        if("".equals(zhaobiaoToubiao.getZhaobiaoToubiaoYesnoText()) || "null".equals(zhaobiaoToubiao.getZhaobiaoToubiaoYesnoText())){
                zhaobiaoToubiao.setZhaobiaoToubiaoYesnoText(null);
        }

            zhaobiaoToubiaoService.updateById(zhaobiaoToubiao);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody ZhaobiaoToubiaoEntity zhaobiaoToubiaoEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,zhaobiaoToubiaoEntity:{}",this.getClass().getName(),zhaobiaoToubiaoEntity.toString());

        ZhaobiaoToubiaoEntity oldZhaobiaoToubiao = zhaobiaoToubiaoService.selectById(zhaobiaoToubiaoEntity.getId());//查询原先数据

//        if(zhaobiaoToubiaoEntity.getZhaobiaoToubiaoYesnoTypes() == 2){//通过
//            zhaobiaoToubiaoEntity.setZhaobiaoToubiaoTypes();
//        }else if(zhaobiaoToubiaoEntity.getZhaobiaoToubiaoYesnoTypes() == 3){//拒绝
//            zhaobiaoToubiaoEntity.setZhaobiaoToubiaoTypes();
//        }
        zhaobiaoToubiaoEntity.setZhaobiaoToubiaoShenheTime(new Date());//回复时间
        zhaobiaoToubiaoService.updateById(zhaobiaoToubiaoEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ZhaobiaoToubiaoEntity> oldZhaobiaoToubiaoList =zhaobiaoToubiaoService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        zhaobiaoToubiaoService.deleteBatchIds(Arrays.asList(ids));

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
            List<ZhaobiaoToubiaoEntity> zhaobiaoToubiaoList = new ArrayList<>();//上传的东西
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
                            ZhaobiaoToubiaoEntity zhaobiaoToubiaoEntity = new ZhaobiaoToubiaoEntity();
//                            zhaobiaoToubiaoEntity.setZhaobiaoId(Integer.valueOf(data.get(0)));   //招标 要改的
//                            zhaobiaoToubiaoEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            zhaobiaoToubiaoEntity.setZhaobiaoToubiaoUuidNumber(data.get(0));                    //投标编号 要改的
//                            zhaobiaoToubiaoEntity.setZhaobiaoToubiaoFile(data.get(0));                    //投标文件 要改的
//                            zhaobiaoToubiaoEntity.setZhaobiaoToubiaoTime(sdf.parse(data.get(0)));          //投标时间 要改的
//                            zhaobiaoToubiaoEntity.setZhaobiaoToubiaoContent("");//详情和图片
//                            zhaobiaoToubiaoEntity.setInsertTime(date);//时间
//                            zhaobiaoToubiaoEntity.setZhaobiaoToubiaoYesnoTypes(Integer.valueOf(data.get(0)));   //投标状态 要改的
//                            zhaobiaoToubiaoEntity.setZhaobiaoToubiaoPingfen(data.get(0));                    //投标评分 要改的
//                            zhaobiaoToubiaoEntity.setZhaobiaoToubiaoYesnoText(data.get(0));                    //投标回复 要改的
//                            zhaobiaoToubiaoEntity.setZhaobiaoToubiaoShenheTime(sdf.parse(data.get(0)));          //回复时间 要改的
//                            zhaobiaoToubiaoEntity.setCreateTime(date);//时间
                            zhaobiaoToubiaoList.add(zhaobiaoToubiaoEntity);


                            //把要查询是否重复的字段放入map中
                                //投标编号
                                if(seachFields.containsKey("zhaobiaoToubiaoUuidNumber")){
                                    List<String> zhaobiaoToubiaoUuidNumber = seachFields.get("zhaobiaoToubiaoUuidNumber");
                                    zhaobiaoToubiaoUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> zhaobiaoToubiaoUuidNumber = new ArrayList<>();
                                    zhaobiaoToubiaoUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("zhaobiaoToubiaoUuidNumber",zhaobiaoToubiaoUuidNumber);
                                }
                        }

                        //查询是否重复
                         //投标编号
                        List<ZhaobiaoToubiaoEntity> zhaobiaoToubiaoEntities_zhaobiaoToubiaoUuidNumber = zhaobiaoToubiaoService.selectList(new EntityWrapper<ZhaobiaoToubiaoEntity>().in("zhaobiao_toubiao_uuid_number", seachFields.get("zhaobiaoToubiaoUuidNumber")));
                        if(zhaobiaoToubiaoEntities_zhaobiaoToubiaoUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZhaobiaoToubiaoEntity s:zhaobiaoToubiaoEntities_zhaobiaoToubiaoUuidNumber){
                                repeatFields.add(s.getZhaobiaoToubiaoUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [投标编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        zhaobiaoToubiaoService.insertBatch(zhaobiaoToubiaoList);
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

