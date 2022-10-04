package com.kelaniya.backend.configuration.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{
 


    @Override
    public void addCorsMappings(CorsRegistry registry) {
      registry.addMapping("/**")
              .allowedMethods(GET, PUT, DELETE, POST)
              .allowedHeaders("*")
              .allowedOrigins("http://localhost:3000")
              .allowCredentials(false);
    }
  };

