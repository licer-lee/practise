package com.example.practise.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Bean级生命周期接口
 * BeanFactoryAware 中可以获取BeanFactory
 */
@Component
public class BeanLifeCircle2 implements BeanFactoryAware {

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void isSingletonBean(){
        BeanSingleton bean = (BeanSingleton)beanFactory.getBean("beanSingleton");
        boolean isbeanLifeCircle = this.beanFactory.isSingleton("beanSingleton");
        System.out.println(String.format("%s isSingleton = %s " , bean, isbeanLifeCircle));
    }

    @PostConstruct
    public void postConstruct(){
        isSingletonBean();
        info();
    }

    private void info() {
        System.out.println("beanFactory = " + beanFactory);
    }
}
