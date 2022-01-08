package com.murphy.test2;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Murphy
 */
@SpringBootApplication
@EnableDubbo
public class Test2Application {

    public static void main(String[] args) {
        SpringApplication.run(Test2Application.class, args);
    }

}
