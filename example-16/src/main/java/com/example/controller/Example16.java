package com.example.controller;

import com.example.beans.LazyLoader;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example16 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /* when I define a LazyLoader class with @Lazy annotation then for creating
         its bean you need to call it separately.
         By default spring call it eagerly.
         */

        System.out.println("Here developer call a spring context to create a bean for a @Lazy annotated component");
        
        LazyLoader lazy = context.getBean(LazyLoader.class);
    }
}
