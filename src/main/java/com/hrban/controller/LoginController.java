package com.hrban.controller;

import com.alibaba.fastjson.JSONObject;
import com.hrban.bean.TblUserRecord;
import com.hrban.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    /**
     * 没有任何意义 只是为了不报错 容忍前端
     * @return
     */
    @RequestMapping("/auth/2step-code")
    public Boolean test() {
        System.out.println("前端框架自带验证规则");
        return true;
    }

    @RequestMapping("/auth/login")
    //1,RequestBody 2,RequestParam
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("login");
        System.out.println(username + "--" + password);
        TblUserRecord tblUserRecord = loginService.login(username, password);
        System.out.println(tblUserRecord);
        return JSONObject.toJSONString(tblUserRecord);
    }
}
