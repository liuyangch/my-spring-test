package com.springframework.beans.factory.config;

/**
 * @author
 * @description
 *   定义bean的引用类型
 * @date 2021/10/12
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
