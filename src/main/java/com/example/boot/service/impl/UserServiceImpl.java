package com.example.boot.service.impl;


import com.example.boot.dao.UserDao;
import com.example.boot.model.User;
import com.example.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
   private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
