package com.hrban.controller;

import com.alibaba.fastjson.JSONObject;
import com.hrban.bean.TblCompany;
import com.hrban.returnJson.ReturnObject;
import com.hrban.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstateController {

    @Autowired
    private EstateService estateService;

    @RequestMapping("/estate/selectCompany")
    public String selectCompany() {
        System.out.println("selectCompany");
        List<TblCompany> companyList = estateService.selectCompany();
        return JSONObject.toJSONString(new ReturnObject(companyList));
    }
}
