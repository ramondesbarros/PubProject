package br.com.pubproject.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/customer/redis/customer").setViewName("customer");
        registry.addViewController("/customer").setViewName("customer");
        registry.addViewController("/command").setViewName("command");
        registry.addViewController("/items").setViewName("items");
        registry.addViewController("/product").setViewName("product");
    }
}
