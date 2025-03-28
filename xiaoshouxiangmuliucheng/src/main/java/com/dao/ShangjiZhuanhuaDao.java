package com.dao;

import com.entity.ShangjiZhuanhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjiZhuanhuaView;

/**
 * 商机转化 Dao 接口
 *
 * @author 
 */
public interface ShangjiZhuanhuaDao extends BaseMapper<ShangjiZhuanhuaEntity> {

   List<ShangjiZhuanhuaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
