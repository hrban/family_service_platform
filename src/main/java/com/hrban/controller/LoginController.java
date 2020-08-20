package com.hrban.controller;

import com.alibaba.fastjson.JSONObject;
import com.hrban.bean.TblUserRecord;
import com.hrban.returnJson.Permission;
import com.hrban.returnJson.Permissons;
import com.hrban.returnJson.ReturnObject;
import com.hrban.returnJson.UserInfo;
import com.hrban.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        System.out.println("login");
        System.out.println(username + "--" + password);
        TblUserRecord tblUserRecord = loginService.login(username, password);
        tblUserRecord.setToken(tblUserRecord.getUserName());
        //将用户数据写入session
        session.setAttribute("userRecord", tblUserRecord);
        ReturnObject returnObject = new ReturnObject(tblUserRecord);
        return JSONObject.toJSONString(returnObject);
    }
    @RequestMapping("/user/info")
    public String getInfo(HttpSession session) {
        //session实现多个方法数据共享
        //跨域导致session失效 id不同
        TblUserRecord tblUserRecord = (TblUserRecord) session.getAttribute("userRecord");
        //获取模块信息
        String[] split = tblUserRecord.getTblRole().getRolePrivileges().split("-");
        //创建权限集合对象
        Permissons permissons = new Permissons();
        //集合对象添加具体权限
        List<Permission> permissionList = new ArrayList<>();
        for(String s : split) {
            permissionList.add(new Permission(s));
        }
        permissons.setPermissionList(permissionList);
        UserInfo userInfo = new UserInfo(tblUserRecord.getUserName(), permissons);
        return JSONObject.toJSONString(new ReturnObject(userInfo));
    }

    @RequestMapping("/auth/logout")
    public String logout(HttpSession session) {
        System.out.println("退出登录");
        session.invalidate();

        return JSONObject.toJSONString(new ReturnObject(null));
    }
}
