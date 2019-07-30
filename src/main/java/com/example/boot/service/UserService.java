package com.example.boot.service;

import com.example.boot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> findAll();
}
