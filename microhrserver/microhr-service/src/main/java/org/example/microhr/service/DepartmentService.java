package org.example.microhr.service;


import org.example.microhr.model.Department;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface DepartmentService {

    List<Department> getAllDepartments();

    void addDep(Department dep);

    void deleteDepById(Department dep);

    List<Department> getAllDepartmentsWithOutChildren();
}
