package com.in28minuates.in28minspringboot3springframework6.ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    // Can Define Spring Bean in here

    @Bean
    public String name(){
        return "name";
    }


}
