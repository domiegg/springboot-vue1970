package com.dao;

import com.entity.LixiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LixiangView;

/**
 * 项目立项 Dao 接口
 *
 * @author 
 */
public interface LixiangDao extends BaseMapper<LixiangEntity> {

   List<LixiangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
