package com.example.practise.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Bean自身的方法
 * 包括了Bean本身调用的方法和通过配置文件中<bean>的init-method和destroy-method指定的方法
 */
@Configuration
public class Bean1 {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Bean2 bean2(){
        return new Bean2();
    }

}
