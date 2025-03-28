package com.dao;

import com.entity.XiansuoGenjinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiansuoGenjinView;

/**
 * 线索跟进 Dao 接口
 *
 * @author 
 */
public interface XiansuoGenjinDao extends BaseMapper<XiansuoGenjinEntity> {

   List<XiansuoGenjinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
