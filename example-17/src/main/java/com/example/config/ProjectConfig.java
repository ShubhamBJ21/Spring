package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example.service", "com.example.aspects"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ProjectConfig {
}
