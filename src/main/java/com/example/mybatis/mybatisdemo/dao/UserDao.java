package com.example.mybatis.mybatisdemo.dao;

import com.example.mybatis.mybatisdemo.model.User;
import com.example.mybatis.mybatisdemo.model.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    /**
     * 新增
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 查询
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

}