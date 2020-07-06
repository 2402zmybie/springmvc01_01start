package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HTTP协议中, 四个表示操作方式的动词 (GET,POST,PUT,DELETE), 以协议区分用户的操作
 * GET获取资源,Post新建资源,Put更新资源,Delete删除资源
 *
 * Rest希望以非常简洁的URL地址来发请求, 用请求方式区分区分对资源操作
 * Rest推荐: url地址这么起名:  /资源名/资源标识符
 *      /book/1 :GET ----查询1号图书
 *      /book/1 :Put --- 更新1号图书
 *      /book/1 :Delete ---删除1号图书
 *      /book   :Post ---添加1本图书
 */

@Controller
@ResponseBody
public class RestTest {

    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public String addBook() {
        return "addBook";
    }

    @RequestMapping(value = "/book/{id}",method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("id") Integer id) {
        return "deleteBook---" + id;
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.PUT)
    public String updateBook(@PathVariable("id") Integer id) {
        return "updateBook---" + id;
    }

    /**
     * 占位符里面的bid 和 @PathVariable("bid")保持一致
     * @param id
     * @return
     */
    @RequestMapping(value = "/book/{bid}",method = RequestMethod.GET)
    public String getBook(@PathVariable("bid") Integer id) {
        return "getBook---" + id;
    }

}
