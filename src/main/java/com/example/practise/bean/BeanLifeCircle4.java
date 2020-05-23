package com.example.practise.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Bean级生命周期接口
 * BeanNameAware 目的：获取当前bean在容器中的name
 */
@Component
public class BeanLifeCircle4 implements BeanNameAware {

    private String beanName;

    @PostConstruct
    public void postConstruct(){
        System.out.println("beanName = " + beanName);
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;

    }
}
