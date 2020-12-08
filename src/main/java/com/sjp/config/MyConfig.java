package com.sjp.config;

import com.sjp.bean.Color;
import com.sjp.bean.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: sjp
 * @Date : Created in 2020/12/8
 * @Description:
 */

@Configuration
@Import({Red.class,MyImportSelector.class})
public class MyConfig {

    @Bean
    public Color color() {
        return new Color();
    }

}
