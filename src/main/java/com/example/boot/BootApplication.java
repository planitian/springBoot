package com.example.boot;

import com.example.boot.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;


@SpringBootApplication
@MapperScan(basePackages = "com.example.boot.dao")
@EnableCaching
@EnableJms
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Bean
    public User getUser(){
       return new User() {
           {
               this.setName("注入");
           }
       };
    }
}
