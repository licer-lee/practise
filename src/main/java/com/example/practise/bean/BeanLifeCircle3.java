package com.example.practise.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Bean级生命周期接口
 * ApplicationContextAware 中可以获取ApplicationContext
 */
@Component
public class BeanLifeCircle3 implements ApplicationContextAware {

    private ApplicationContext applicationContext;


    public void isSingletonBean(){
        BeanPrototype bean = applicationContext.getBean(BeanPrototype.class);
        boolean isbeanLifeCircle = this.applicationContext.isSingleton("beanPrototype");
        System.out.println(String.format("%s isSingleton = %s " , bean, isbeanLifeCircle));
    }

    @PostConstruct
    public void postConstruct(){
        isSingletonBean();
        info();
    }

    public void info(){
        System.out.println("applicationContext = " + applicationContext);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
