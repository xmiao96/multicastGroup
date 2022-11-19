package com.example.hazelcast_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class HazelcastTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HazelcastTestApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:3000/");
            }
        };
    }
}
