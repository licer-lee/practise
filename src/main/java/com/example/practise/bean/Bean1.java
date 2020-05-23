package com.example.practise.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean自身的方法
 * 包括了Bean本身调用的方法和通过配置文件中<bean>的init-method和destroy-method指定的方法
 */
@Configuration
public class Bean1 {

    @Bean(initMethod = "myInit", destroyMethod = "myDestory")
    public void myBean1(){

    }

    public void myInit(){}

    public void myDestory(){}

}
