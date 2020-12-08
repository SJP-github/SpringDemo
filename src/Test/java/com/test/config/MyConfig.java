package com.test.config;

import com.sjp.bean.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: sjp
 * @Date : Created in 2020/12/8
 * @Description:
 */

@Configuration
public class MyConfig {

    @Bean
    public Color color() {
        return new Color();
    }
}
