package com.rsaglobaltech.ecs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rsaglobaltech.ecs.demo")
public class AWSEcsDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(AWSEcsDemoApp.class, args);
    }
}
