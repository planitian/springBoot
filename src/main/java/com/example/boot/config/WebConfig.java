package com.example.boot.config;

import com.example.boot.component.ApiIntercepter;
import com.example.boot.component.Four;
import com.example.boot.component.Three;
import com.example.boot.component.TwoIntercepter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Author: plani
 * @Date: 2019/4/2 23:41
 */
@SpringBootConfiguration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        registry.addInterceptor(new ApiIntercepter());
        //注册拦截器
        registry.addInterceptor(new TwoIntercepter());
        registry.addInterceptor(new Three());
        registry.addInterceptor(new Four());
    }

/*    @Bean
    public InternalResourceViewResolver setupViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setOrder(1);
        return resolver;
    }*/

}

