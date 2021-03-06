package com.murphy.test4;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Murphy
 */
@SpringBootApplication
@EnableDubbo
public class Test4Application {

    public static void main(String[] args) {
        SpringApplication.run(Test4Application.class, args);
    }

}
