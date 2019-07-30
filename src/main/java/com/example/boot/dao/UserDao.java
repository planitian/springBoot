package com.example.boot.dao;


import com.example.boot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /**
     * 返回
     * @return  返回所有用户
     */
    @Cacheable(cacheNames = "p",keyGenerator = "firstParamKeyGenerator")
    List<User> findAll();
}
