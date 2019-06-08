package com.got;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.got.*"})
@EntityScan("com.got.*")
@PropertySource(value = "file:properties/application.properties", ignoreResourceNotFound = true)
public class GOTApplication {
    public static void main(String[] args) {
        SpringApplication.run(GOTApplication.class, args);
    }


}