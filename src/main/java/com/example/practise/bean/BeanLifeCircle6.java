package com.example.practise.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * Bean级生命周期接口
 * DisposableBean 目的：bean销毁时的清理工作
 */
@Component
public class BeanLifeCircle6 implements DisposableBean

{

    private String beanName;


    @Override
    public void destroy() throws Exception {
        System.out.println("beanName = " + beanName);
    }
}
