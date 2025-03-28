package com.dao;

import com.entity.ZhaobiaoToubiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaobiaoToubiaoView;

/**
 * 投标 Dao 接口
 *
 * @author 
 */
public interface ZhaobiaoToubiaoDao extends BaseMapper<ZhaobiaoToubiaoEntity> {

   List<ZhaobiaoToubiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
