package com.hrban.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//跨域的第二种方式 注解
//@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {}, allowCredentials = "true")
public class TestController {

    /**
     * web交互小测试
     */
    //为了正常的使用不冲突 注释掉这部分
//    @RequestMapping("/auth/login")
    public String test() {
        System.out.println("test");
        return "";
    }
}
