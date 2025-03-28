package com.dao;

import com.entity.LixiangGenjinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LixiangGenjinView;

/**
 * 项目跟进 Dao 接口
 *
 * @author 
 */
public interface LixiangGenjinDao extends BaseMapper<LixiangGenjinEntity> {

   List<LixiangGenjinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
