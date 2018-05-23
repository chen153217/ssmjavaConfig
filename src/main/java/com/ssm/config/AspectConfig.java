package com.ssm.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * Created by chenhansen on 2018/5/20.
 */
@Aspect
@Component
@ImportResource("classpath:spring/aop-config.xml")
public class AspectConfig {

    @Pointcut("execution(* com.ssm.service.*.*(..))")
    public void serviceAnnotatedClass() {
    }
}
