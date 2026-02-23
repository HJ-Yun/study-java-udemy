package com.in28minuates.in28minspringboot3springframework6;

import com.in28minuates.in28minspringboot3springframework6.config.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        // 1. Launch a Spring Context
        // 2. Configure the things that we want Spring to manage. - @Configuration

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));

        // Not worked, cause Bean name is "customAddress"
//        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("customAddress"));

        System.out.println(context.getBean("personMethodCall"));
        System.out.println(context.getBean("personParameter"));


    }
}
