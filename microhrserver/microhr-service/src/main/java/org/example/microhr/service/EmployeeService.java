package org.example.microhr.service;

import org.example.microhr.model.Employee;
import org.example.microhr.model.RespPageBean;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;



public interface EmployeeService {


    public RespPageBean getEmployeeByPage(Integer page, Integer size, Employee employee, Date[] beginDateScope) ;

    public Integer addEmp(Employee employee) ;

    public Integer maxWorkID() ;

    public Integer deleteEmpByEid(Integer id);

    public Integer updateEmp(Employee employee) ;

    public Integer addEmps(List<Employee> list) ;

    public RespPageBean getEmployeeByPageWithSalary(Integer page, Integer size) ;

    public Integer updateEmployeeSalaryById(Integer eid, Integer sid) ;

    public Employee getEmployeeById(Integer empId) ;
}
