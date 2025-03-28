
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
 * 商机转化
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shangjiZhuanhua")
public class ShangjiZhuanhuaController {
    private static final Logger logger = LoggerFactory.getLogger(ShangjiZhuanhuaController.class);

    private static final String TABLE_NAME = "shangjiZhuanhua";

    @Autowired
    private ShangjiZhuanhuaService shangjiZhuanhuaService;


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
        PageUtils page = shangjiZhuanhuaService.queryPage(params);

        //字典表数据转换
        List<ShangjiZhuanhuaView> list =(List<ShangjiZhuanhuaView>)page.getList();
        for(ShangjiZhuanhuaView c:list){
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
        ShangjiZhuanhuaEntity shangjiZhuanhua = shangjiZhuanhuaService.selectById(id);
        if(shangjiZhuanhua !=null){
            //entity转view
            ShangjiZhuanhuaView view = new ShangjiZhuanhuaView();
            BeanUtils.copyProperties( shangjiZhuanhua , view );//把实体数据重构到view中
            //级联表 商机
            //级联表
            ShangjiEntity shangji = shangjiService.selectById(shangjiZhuanhua.getShangjiId());
            if(shangji != null){
            BeanUtils.copyProperties( shangji , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setShangjiId(shangji.getId());
            }
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(shangjiZhuanhua.getYonghuId());
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
    public R save(@RequestBody ShangjiZhuanhuaEntity shangjiZhuanhua, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shangjiZhuanhua:{}",this.getClass().getName(),shangjiZhuanhua.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            shangjiZhuanhua.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ShangjiZhuanhuaEntity> queryWrapper = new EntityWrapper<ShangjiZhuanhuaEntity>()
            .eq("shangji_id", shangjiZhuanhua.getShangjiId())
            .eq("yonghu_id", shangjiZhuanhua.getYonghuId())
            .eq("shangji_zhuanhua_name", shangjiZhuanhua.getShangjiZhuanhuaName())
            .eq("shangji_zhuanhua_types", shangjiZhuanhua.getShangjiZhuanhuaTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShangjiZhuanhuaEntity shangjiZhuanhuaEntity = shangjiZhuanhuaService.selectOne(queryWrapper);
        if(shangjiZhuanhuaEntity==null){
            shangjiZhuanhua.setInsertTime(new Date());
            shangjiZhuanhua.setCreateTime(new Date());
            shangjiZhuanhuaService.insert(shangjiZhuanhua);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShangjiZhuanhuaEntity shangjiZhuanhua, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,shangjiZhuanhua:{}",this.getClass().getName(),shangjiZhuanhua.toString());
        ShangjiZhuanhuaEntity oldShangjiZhuanhuaEntity = shangjiZhuanhuaService.selectById(shangjiZhuanhua.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            shangjiZhuanhua.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(shangjiZhuanhua.getShangjiZhuanhuaFile()) || "null".equals(shangjiZhuanhua.getShangjiZhuanhuaFile())){
                shangjiZhuanhua.setShangjiZhuanhuaFile(null);
        }
        if("".equals(shangjiZhuanhua.getShangjiZhuanhuaContent()) || "null".equals(shangjiZhuanhua.getShangjiZhuanhuaContent())){
                shangjiZhuanhua.setShangjiZhuanhuaContent(null);
        }

            shangjiZhuanhuaService.updateById(shangjiZhuanhua);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ShangjiZhuanhuaEntity> oldShangjiZhuanhuaList =shangjiZhuanhuaService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        shangjiZhuanhuaService.deleteBatchIds(Arrays.asList(ids));

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
            List<ShangjiZhuanhuaEntity> shangjiZhuanhuaList = new ArrayList<>();//上传的东西
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
                            ShangjiZhuanhuaEntity shangjiZhuanhuaEntity = new ShangjiZhuanhuaEntity();
//                            shangjiZhuanhuaEntity.setShangjiId(Integer.valueOf(data.get(0)));   //商机 要改的
//                            shangjiZhuanhuaEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            shangjiZhuanhuaEntity.setShangjiZhuanhuaUuidNumber(data.get(0));                    //商机转化编号 要改的
//                            shangjiZhuanhuaEntity.setShangjiZhuanhuaName(data.get(0));                    //商机转化标题 要改的
//                            shangjiZhuanhuaEntity.setShangjiZhuanhuaTime(sdf.parse(data.get(0)));          //转化时间 要改的
//                            shangjiZhuanhuaEntity.setShangjiZhuanhuaFile(data.get(0));                    //附件 要改的
//                            shangjiZhuanhuaEntity.setShangjiZhuanhuaTypes(Integer.valueOf(data.get(0)));   //商机转化类型 要改的
//                            shangjiZhuanhuaEntity.setShangjiZhuanhuaContent("");//详情和图片
//                            shangjiZhuanhuaEntity.setInsertTime(date);//时间
//                            shangjiZhuanhuaEntity.setCreateTime(date);//时间
                            shangjiZhuanhuaList.add(shangjiZhuanhuaEntity);


                            //把要查询是否重复的字段放入map中
                                //商机转化编号
                                if(seachFields.containsKey("shangjiZhuanhuaUuidNumber")){
                                    List<String> shangjiZhuanhuaUuidNumber = seachFields.get("shangjiZhuanhuaUuidNumber");
                                    shangjiZhuanhuaUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> shangjiZhuanhuaUuidNumber = new ArrayList<>();
                                    shangjiZhuanhuaUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("shangjiZhuanhuaUuidNumber",shangjiZhuanhuaUuidNumber);
                                }
                        }

                        //查询是否重复
                         //商机转化编号
                        List<ShangjiZhuanhuaEntity> shangjiZhuanhuaEntities_shangjiZhuanhuaUuidNumber = shangjiZhuanhuaService.selectList(new EntityWrapper<ShangjiZhuanhuaEntity>().in("shangji_zhuanhua_uuid_number", seachFields.get("shangjiZhuanhuaUuidNumber")));
                        if(shangjiZhuanhuaEntities_shangjiZhuanhuaUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ShangjiZhuanhuaEntity s:shangjiZhuanhuaEntities_shangjiZhuanhuaUuidNumber){
                                repeatFields.add(s.getShangjiZhuanhuaUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [商机转化编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        shangjiZhuanhuaService.insertBatch(shangjiZhuanhuaList);
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

