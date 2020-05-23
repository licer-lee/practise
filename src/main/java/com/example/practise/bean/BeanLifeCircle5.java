package com.example.practise.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.env.MissingRequiredPropertiesException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Bean级生命周期接口
 * InitializingBean 目的：在属性设置完成后调用
 */
@Component
public class BeanLifeCircle5 implements InitializingBean
        , BeanNameAware
{

    private String beanName;

    /**
     * 在bean的field设置完成后调用，可以用于检查配置是否正确
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("beanName = " + beanName);
        if(beanName == null){
            throw new MissingRequiredPropertiesException();
        }
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }
}
