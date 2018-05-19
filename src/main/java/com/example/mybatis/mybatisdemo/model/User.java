package com.example.mybatis.mybatisdemo.model;

import lombok.Data;

@Data
public class User {
    /**
     * id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

}