package com.example.mybatis.mybatisdemo.dao;

import com.example.mybatis.mybatisdemo.model.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeDao {
    /**
     * 保存员工信息
     * @param employee
     * @return
     */
    int saveEmployee(Employee employee);
}
