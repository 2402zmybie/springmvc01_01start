package com.hr.controller;

import com.hr.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

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
        System.out.println("PathVariable......" + id);
        return "success";
    }


    @GetMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println(header);  //text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
        return "success";
    }

    /**
     * 获取Cookie的值
     * 用浏览器发请求, 服务器会存储一个session的空间, 会通过cookie的形式把session写回来(JSESSIONID)
     * @return
     */
    @GetMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println(cookieValue);  //CEFA2FF8B9675916A64350B4F7DCC61B
        return "success";
    }


    /**
     * ModelAttribute:
     *  作用: 该注解是SpringMVC4.3版本以后新加入的, 它可以用于修饰方法和参数
     *       出现在方法上,表示当前方法会在控制器的方法执行之前,先执行.它可以修饰没有返回值的方法,也可以修饰有具体返回值的方法
     *       出现在参数上, 获取指定的数据给参数赋值
     *  属性:
     *      value: 用于获取数据的key, key可以是POJO的属性名称,也可以是map结构的key
     *  应用场景:
     *      当表单提交数据不是完整的实体类数据时, 保证没有提交数据的字段使用数据库对象原来的数据
     *      例如:
     *          我们在编辑一个用户时,用户有一个创建信息字段,该字段的值是不允许被修改的, 在提交表单数据是肯定没有此字段的内容
     *          ,一旦更新会把该字段内容为null, 此时就可以使用此注解解决问题
     */
//    @PostMapping("/testModelAttribute")
//    public String testModelAttribute(User user) {
//        System.out.println("testModelAttribute执行了.....");
//        System.out.println(user);
//        return "success";
//    }


    /**
     * 方法上的ModelAttribute (有返回值的ModelAttribute)
     *   会在anno.jsp中任意一个请求之前执行, 此处演示testModelAttribute这个请求
     */
//    @ModelAttribute
//    public User showUser(String uname,Integer uage) {
//        System.out.println("showUser执行了...");
//        //通过用户查询数据库
//        User user = new User();
//        user.setUname(uname);
//        user.setUage(uage);
//        user.setDate(new Date());
//        return user;
//    }

    /**
     * 方法上的ModelAttribute (没有返回值的ModelAttribute)
     * @param uname
     * @param uage
     * @return
     */
    @ModelAttribute
    public void showUser(String uname, Integer uage, Map<String,User> map) {
        System.out.println("showUser执行了...");
        //通过用户查询数据库
        User user = new User();
        user.setUname(uname);
        user.setUage(uage);
        user.setDate(new Date());
        map.put("abc",user);
    }

    /**
     * 参数上的ModelAttribute
     * @return
     */
    @PostMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println("testModelAttribute执行了.....");
        System.out.println(user);
        return "success";
    }
}
