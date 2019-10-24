package com.mybatis.demo.dao;

import com.mybatis.demo.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getUsers();
}
