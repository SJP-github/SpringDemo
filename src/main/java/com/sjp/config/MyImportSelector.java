package com.sjp.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;
import java.util.function.Predicate;

/**
 * @Author: sjp
 * @Date : Created in 2020/12/8
 * @Description:
 */

public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();
        for (String annotationType : annotationTypes) {
            System.out.println("#@"+annotationType);
        }
        annotationMetadata.hasAnnotatedMethods("Bean");
        return new String[0];
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }
}
