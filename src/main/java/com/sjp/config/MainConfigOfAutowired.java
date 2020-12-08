package com.sjp.config;

import org.springframework.context.annotation.Configuration;

/**
 * 自动装配
 *      spring利用依赖注入，完成对IOC容器中各个组件依赖关系的赋值
 *   1） @Autowired 可以在方法、参数、属性、构造方法上使用
 *          1.1 Autowired按类型自动装配
 *          1.2 如果有多个的话按注入名称装配
 *          1.3 使用@Qualifier 指定需要装配的组件id
 *          1.4 自动装配默认一定要将属性赋值好，否则报错
 *          1.5 如果不是必须可以将Autowired注解的required=false
 *          1.6 多个的话可以指定优先装配的bean，@Primary
 *
 *   2） spring还支持使用@Resource（JSR250）和@Inject(JSR330)
 *
 *   3) AutowiredAnnotationBeanPostProcessor:解析完成自动装配功能
 *
 *   4）自定义组件想要使用spring容器底层的组件需要实现****Aware接口
 *          ApplicationContextAware 感知接口
 *          ApplicationContextAwareProcessor处理ApplicationContextAware
 */

@Configuration
public class MainConfigOfAutowired {



}
