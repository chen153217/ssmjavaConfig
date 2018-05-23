package com.ssm.config;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by chenhansen on 2018/5/20.
 */


@Configuration
@ComponentScan(basePackages = {"com.ssm"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
@Import(DruidDataSourceConfig.class)
@ImportResource(locations = {"classpath:spring/mybatis.xml","classpath:generatorConfig.xml"})


public class RootConfig {



    @Bean
    public BeanNameAutoProxyCreator proxycreate(){
        BeanNameAutoProxyCreator proxycreate = new BeanNameAutoProxyCreator();
        proxycreate.setProxyTargetClass(true);
        proxycreate.setBeanNames("*ServiceImpl");
        proxycreate.setInterceptorNames("transactionInterceptor");
        return proxycreate;
    }


}
