package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/anno")
public class AnnoController {

    /**
     *RequestParam注解:  value请求参数的名称
     *                   required: 请求参数中是否必须提供此参数,默认值true表示必须提供,如果不提供则报错
     * 当写了@RequestParam没有指定required属性为false的时候必须传value指定的参数
     */
    @GetMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username",required = true) String username) {
        System.out.println("传递参数username----" + username);
        return "success";
    }
}
