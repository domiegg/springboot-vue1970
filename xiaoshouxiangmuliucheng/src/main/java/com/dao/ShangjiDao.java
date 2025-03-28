package com.dao;

import com.entity.ShangjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjiView;

/**
 * 商机 Dao 接口
 *
 * @author 
 */
public interface ShangjiDao extends BaseMapper<ShangjiEntity> {

   List<ShangjiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
