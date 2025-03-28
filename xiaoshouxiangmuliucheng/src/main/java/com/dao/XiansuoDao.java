package com.dao;

import com.entity.XiansuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiansuoView;

/**
 * 线索 Dao 接口
 *
 * @author 
 */
public interface XiansuoDao extends BaseMapper<XiansuoEntity> {

   List<XiansuoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
