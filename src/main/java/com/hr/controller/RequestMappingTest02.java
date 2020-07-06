package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RequestMappingTest02 {

    /**
     * 路径上可以有占位符, 占位符语法就是可以在任意路径的地方写一个{变量名}
     *  //  /user/admin  和 /user/xiaohe
     * @return
     */
    @RequestMapping("/user/{id}")
    public String pathVariableTest(@PathVariable("id") String id) {
        return "(success)rest请求的参数: " + id ;
    }

    @RequestMapping("/{haha}/{id}")
    public String pathVariableTest02(@PathVariable String haha, @PathVariable String id) {
        return "PathVariable两层路径" + haha + "---" + id;
    }

}
