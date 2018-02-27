package org.happysathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@PropertySource("classpath:application.properties")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "spring-boot-microservice");
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").
                        allowedOrigins("*").
                        allowedMethods("GET", "POST", "PUT", "DELETE", "OPTION")
                        .allowedHeaders("*")
                        .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials", "origin", "content-type", "accept")
                        .allowCredentials(true)
                        .maxAge(3600);
            }
        };
    }

}
