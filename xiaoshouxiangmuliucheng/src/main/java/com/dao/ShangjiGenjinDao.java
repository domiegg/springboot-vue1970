package com.dao;

import com.entity.ShangjiGenjinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjiGenjinView;

/**
 * 商机跟进 Dao 接口
 *
 * @author 
 */
public interface ShangjiGenjinDao extends BaseMapper<ShangjiGenjinEntity> {

   List<ShangjiGenjinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
