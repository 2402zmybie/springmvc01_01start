package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @RequestMapping模糊匹配功能
 * URL地址可以写模糊的通配符
 *   ? : 能替代任意一个字符
 *   * : 能替代任意多个字符,和一层路径
 *   ** : 能替代多层路径
 */

@Controller
@ResponseBody
public class RequestMappingTest {

    @RequestMapping("/antTest01")
    public String antTest01() {
        System.out.println("antTest01....");
        return "success";
    }

    //占位符(?) 匹配一个字符  /antTest04都可以请求到 (?匹配一个字符, 0个多个都不行)
    @RequestMapping("/antTest0?")
    public String antTest02() {
        System.out.println("antTest0?  ....");
        return "success";
    }

    /**
     * 占位符(*) /antTest0 和/antTest0afdfsd  都能匹配到
     * @return
     */
    @RequestMapping("/antTest0*")
    public String antTest03() {
        System.out.println("antTest0* ....");
        return "success";
    }

}
