package com.in28minuates.in28minspringboot3springframework6.ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args) {

        // 1. Configure the things that we want Spring to manage -> @Configuration
        // -> Create HelloWorldConfiguration Class with @Configuration

        // 2. Launch a Spring Contest
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 3. Use Context
        System.out.println(context.getBean("name"));

    }
}
