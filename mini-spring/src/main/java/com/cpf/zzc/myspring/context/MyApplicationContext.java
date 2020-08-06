package com.cpf.zzc.myspring.context;

import java.util.List;

/**
 * date 2020/8/1
 *
 * @author caopengflying
 */
public class MyApplicationContext {
    private String[] configLocations;
    private MyBeanDefinitionReader reader;

    public MyApplicationContext(String... configLocations) {
        this.configLocations = configLocations;

        reader = new MyBeanDefinitionReader();
        List<MyBeanDefinition> beanDefinitionList = reader.doLoadBeanDefinitions();

        doRegistyBeanDefintion(beanDefinitionList);


    }

    private void doRegistyBeanDefintion(List<MyBeanDefinition> beanDefinitionList) {


    }

    public Object getBean(String beanName) {
        return null;
    }

    public Object getBean(Class className) {
        return null;
    }
}
