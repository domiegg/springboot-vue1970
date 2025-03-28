package com.dao;

import com.entity.ZhaobiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaobiaoView;

/**
 * 招标 Dao 接口
 *
 * @author 
 */
public interface ZhaobiaoDao extends BaseMapper<ZhaobiaoEntity> {

   List<ZhaobiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
