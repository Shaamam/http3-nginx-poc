package com.spring.http3_nginx_poc.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/api/v1/hello")
    public String greeting(){
        return "Welcome to HTTP/3!!";
    }
}
