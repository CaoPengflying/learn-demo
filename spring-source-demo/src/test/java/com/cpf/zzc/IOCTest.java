package com.cpf.zzc;

import com.cpf.zzc.bean.Cat;
import com.cpf.zzc.config.AppConfig;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
    /*

    EnvironmentCapable：取环境相关的参数，.properties文件
    ListableBeanFactory：提供BeanFactory行为
    HierarchicalBeanFactory：父子容器
        ---提供bean分层管理的方式
            且父容器无法访问子容器，子容器可以访问父容器,就比如只有儿子问老爸拿钱，没有父亲问儿子要钱的
    MessageSource：国际化
    ApplicationEventPublisher：应用的事件发布，比如应用的开启，结束，销毁等等
    ResourcePatternResolver：加载Resource

    */
    @Test
    public void test(){
        // ioc 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //NoSuchBeanDefinition bean定义，承载bean的属性 init-method scope
        //BeanDefinitionRegistry 注册器
        //registerBeanDefinition(beanName, BeanDefinition )
        // BeanDefinitionMap(key:beanName, value: BeanDefinition)
        BeanDefinition beanDefinition = new RootBeanDefinition(Cat.class);

        DefaultListableBeanFactory beanFactory = applicationContext.getDefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("cat",beanDefinition);
        applicationContext.getBean(Cat.class);
    }
}
