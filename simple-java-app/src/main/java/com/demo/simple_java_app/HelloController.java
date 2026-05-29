package com.demo.simple_java_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! This Spring Boot app was built and deployed via Jenkins pipeline.";
    }
}
