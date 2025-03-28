package com.dao;

import com.entity.HetongqianshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HetongqianshuView;

/**
 * 合同签署 Dao 接口
 *
 * @author 
 */
public interface HetongqianshuDao extends BaseMapper<HetongqianshuEntity> {

   List<HetongqianshuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
