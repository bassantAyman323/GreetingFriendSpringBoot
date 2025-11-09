package com.example.GreetingFriendExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Dear") String name) {
        return "Hello, " + name ;
    }
}
