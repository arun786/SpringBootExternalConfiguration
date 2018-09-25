package com.arun.springexternalconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:translator.properties")
public class SpringexternalconfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringexternalconfigurationApplication.class, args);
    }
}
