package com.hrban.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    /**
     * web交互小测试
     */
    @RequestMapping("/auth/login")
    public String test() {
        System.out.println("test");
        return "";
    }
}
