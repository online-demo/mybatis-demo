package com.example.mybatis.mybatisdemo.service;

import com.example.mybatis.mybatisdemo.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSaveEmployee() {
        Employee employee = new Employee();
        employee.setName("张三");
        employee.setDept("销售部");
        employee.setSalary(5000);
        int result = employeeService.saveEmployee(employee);
        System.out.printf("执行结果是%d%n", result);
    }
}
