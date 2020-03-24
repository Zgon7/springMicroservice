package com.example.micrservicetest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "example")
public interface client {
    @GetMapping("/karim")
    String test();
}
