package com.example.boot.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

public class RedisUtils {
    @Autowired
    private  static RedisTemplate<String, Object> redisTemplate;


    /**
     * 指定缓存失效时间
     * @param key
     * @param time
     * @return
     */
    public  boolean expire(String key, long time) {
        try {
            if (time > 0) {
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
