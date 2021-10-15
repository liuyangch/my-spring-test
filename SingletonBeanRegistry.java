package com.springframework.beans.factory.config;

/**
 * @author
 * @description
 *   单例bean的注册和获取
 * @date 2021/10/12
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
