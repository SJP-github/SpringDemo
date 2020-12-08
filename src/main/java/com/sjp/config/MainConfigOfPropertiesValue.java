package com.sjp.config;

import com.sjp.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @PropertySource 读取外部配置文件的属性到运行的环境变量中去
 */

@Configuration
@PropertySource(value = {"classpath:/person.properties"})
public class MainConfigOfPropertiesValue {

    @Bean
    public Person person() {
        return new Person();
    }

}
