package org.example.microhr.service;


import org.example.microhr.model.Salary;

import java.util.List;


public interface SalaryService {


    public List<Salary> getAllSalaries();

    public Integer addSalary(Salary salary);

    public Integer deleteSalaryById(Integer id);

    public Integer updateSalaryById(Salary salary);
}
