package org.example.microhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.microhr.model.OpLog;
@Mapper
public interface OpLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpLog record);

    int insertSelective(OpLog record);

    OpLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpLog record);

    int updateByPrimaryKey(OpLog record);
}