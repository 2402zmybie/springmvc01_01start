package com.hr.controller;

import com.hr.domain.Account;
import com.hr.domain.AccountOfListOrMap;
import com.hr.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username) {
        System.out.println("请求参数绑定方法执行了");
        System.out.println("username:" + username);
        return "success";
    }

    /**
     * 请求参数绑定把数据封装到java的类中, 类中有引用类型
     * 注意: Post请求中文乱码, 需要配置过滤器
     * @return
     */
    @PostMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println(account);
        return "success";
    }


    /**
     * 请求参数绑定把数据封装到java的类中, 类中有list或者map集合
     * 注意: Post请求中文乱码, 需要配置过滤器
     * @return
     */
    @PostMapping("/saveAccountOfListOrMap")
    public String saveAccountOfListOrMap(AccountOfListOrMap accountOfListOrMap) {
        //AccountOfListOrMap{username='哈哈', password='saf', money=12.0, list=[User{uname='list1', uage=12}], map={one=User{uname='map1', uage=12}}}
        System.out.println(accountOfListOrMap);
        return "success";
    }

    @PostMapping("/saveUser")
    public String saveUser(User user) {
        System.out.println(user);
        return "success";
    }
}
