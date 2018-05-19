package com.example.mybatis.mybatisdemo.service;

import com.example.mybatis.mybatisdemo.model.Employee;

public interface EmployeeService {
    /**
     * 保存职工信息
     * @param employee
     * @return
     */
    int saveEmployee(Employee employee);
}
