package com.gx.dao;

import com.gx.bean.LogManager;
import com.gx.bean.LogManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogManagerMapper {
    long countByExample(LogManagerExample example);

    int deleteByExample(LogManagerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LogManager record);

    int insertSelective(LogManager record);

    List<LogManager> selectByExample(LogManagerExample example);

    LogManager selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LogManager record, @Param("example") LogManagerExample example);

    int updateByExample(@Param("record") LogManager record, @Param("example") LogManagerExample example);

    int updateByPrimaryKeySelective(LogManager record);

    int updateByPrimaryKey(LogManager record);
}