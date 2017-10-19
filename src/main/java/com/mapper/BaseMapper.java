package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseMapper<T> {
    int deleteByPrimaryKey(String id);

    int insert(T record);
    
    int insertSelective(T record);

    T selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
    
    List<T> findPage(@Param("pageIndex")int pageIndex,@Param("pageSize")int pageSize);
}