package com.example.practise.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor 目的：容器级生命周期接口
 */
@Component
public class BeanLifeCircle7 implements BeanPostProcessor
{

    public BeanLifeCircle7(){
        super();
        System.out.println("this = " + this);
    }

    /**
     * 所有bean初始化之前处理器
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        if(bean instanceof BeanLifeCircle6){
            System.out.println("--------------------------------------------");
            System.out.println("postProcessBeforeInitialization bean = [" + bean + "], beanName = [" + beanName + "]");
            System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
//        }
        return bean;
    }

    /**
     * 所有bean初始化后处理器
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        if(bean instanceof BeanLifeCircle6){
            System.out.println("postProcessAfterInitialization bean = [" + bean + "], beanName = [" + beanName + "]");
            System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
            System.out.println("*********************************************");
//        }
        return bean;
    }
}
