package com.sjp;

import com.sjp.bean.Color;
import com.sjp.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: sjp
 * @Date : Created in 2020/12/8
 * @Description:
 */

public class Test {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-----------------------------------------");
        Color color = (Color) applicationContext.getBean("color");
        System.out.println(color);
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
