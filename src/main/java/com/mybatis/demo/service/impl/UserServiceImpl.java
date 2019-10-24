package com.mybatis.demo.service.impl;

import com.mybatis.demo.dao.UserMapper;
import com.mybatis.demo.dto.User;
import com.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getUsers();
    }
}
