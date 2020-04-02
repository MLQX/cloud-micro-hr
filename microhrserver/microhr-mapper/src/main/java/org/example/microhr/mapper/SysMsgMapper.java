package org.example.microhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.microhr.model.SysMsg;
@Mapper
public interface SysMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMsg record);

    int insertSelective(SysMsg record);

    SysMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMsg record);

    int updateByPrimaryKey(SysMsg record);
}