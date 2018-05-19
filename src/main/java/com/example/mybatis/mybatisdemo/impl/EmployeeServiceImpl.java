package com.example.mybatis.mybatisdemo.impl;

import com.example.mybatis.mybatisdemo.dao.EmployeeDao;
import com.example.mybatis.mybatisdemo.model.Employee;
import com.example.mybatis.mybatisdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    /**
     * 保存职工信息
     *
     * @param employee
     * @return
     */
    @Override
    public int saveEmployee(Employee employee) {
        return employeeDao.saveEmployee(employee);
    }
}
