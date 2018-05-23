package com.ssm.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by chenhansen on 2018/5/21.
 */
@PropertySource("classpath:properties/jdbc.properties")
public class Test {
    @Value("${maxActive}")
    private static int maxActive;
    @Value("${maxWait}")
    private static int maxWait;
    public static void main(String[] args){
        System.out.println(maxWait);
    }
}
