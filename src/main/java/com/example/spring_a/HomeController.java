package com.example.spring_a;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    

	@GetMapping("/hello")
    public Map<String, Object> hello(
        ) {
        Map<String, Object> data = new HashMap<>();
        data.put("message", "Hello, from spring-a/hello!");
        return data; // automatically converted to JSON
        }

	@GetMapping("/hey")
    public Map<String, Object> hey(
        ) {
        Map<String, Object> data = new HashMap<>();
        data.put("message", "Hello, from spring-a/hey!");
        return data; // automatically converted to JSON
        }

    
}