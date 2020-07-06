package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(path = "/sayhello")
    public String sayHello() {
        System.out.println("hello springMVC");
        return "success";
    }
}
