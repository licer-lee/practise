package com.example.practise.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * Bean级生命周期接口
 * <p>Spring bean life circle</p>
 * <p>@PostConstruct @PreDestroy 的使用
 * https://www.cnblogs.com/zrtqsk/p/3735273.html
 * </p>
 */
@Component
public class BeanLifeCircle {


    @PostConstruct
    public void init(){
        System.out.println(String.format("@PostConstruct容器初始化时，在bean构造函数后被调用"));
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println(String.format("@PreDestroy在容器销毁前被调用"));
    }


    public BeanLifeCircle(){
        System.out.println(String.format("构造函数初始化"));
    }
}
