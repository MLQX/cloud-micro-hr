package org.example.microhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.microhr.model.Employeeec;
@Mapper
public interface EmployeeecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);
}