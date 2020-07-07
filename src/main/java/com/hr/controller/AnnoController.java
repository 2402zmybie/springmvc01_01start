package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    /**
     * RequestBody:
     *  作用: 用于获取请求体内容, 直接使用得到是key=value&key=value结构的数据,get请求方式不适用
     *  属性: required: 是否必须有请求体,默认值是true. 当取值为true时,get请求方式会报错. 如果取值为false,get请求得到是null
     */
    @PostMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String str) {
        System.out.println(str);   //username=aa&age=122
        return "success";
    }

    @GetMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") String id) {
        System.out.println("PathVariable......" + id);   //username=aa&age=122
        return "success";
    }
}
