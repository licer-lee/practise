package com.example.practise.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCircle8 extends InstantiationAwareBeanPostProcessorAdapter
{

    public BeanLifeCircle8(){
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
        if(bean instanceof BeanLifeCircle6){
            System.out.println("--------------------------------------------");
            System.out.println("postProcessBeforeInitialization bean = [" + bean + "], beanName = [" + beanName + "]");
        }
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
        if(bean instanceof BeanLifeCircle6){
            System.out.println("postProcessAfterInitialization bean = [" + bean + "], beanName = [" + beanName + "]");
            System.out.println("*********************************************");
        }
        return bean;
    }
}
