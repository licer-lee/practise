package com.example.practise.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCircle9 implements BeanFactoryPostProcessor
{

    public BeanLifeCircle9(){
        super();
        System.out.println("this = " + this);
    }

    /**
     * ConfigurableListableBeanFactory得到可配置的beanFactory定制bean行为
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition bean3 = configurableListableBeanFactory.getBeanDefinition("bean3");
        System.out.println("bean3 = " + bean3);
        System.out.println("bean3.getScope() = " + bean3.getScope());
        bean3.getPropertyValues().addPropertyValue("age", 30);
    }
}
