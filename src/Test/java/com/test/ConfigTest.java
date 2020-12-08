package com.test;

import com.test.config.MyConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: sjp
 * @Date : Created in 2020/12/8
 * @Description:
 */
@RunWith(SpringRunner.class)
public class ConfigTest {

    private ApplicationContext applicationContext;

    @Before
    public void applicationContext() {
        applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
    }

    @Test
    public void test1() {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
