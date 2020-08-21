package com.hrban.service;

import com.hrban.bean.TblCompany;
import com.hrban.mapper.TblCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateService {

    @Autowired
    private TblCompanyMapper tblCompanyMapper;

    public List<TblCompany> selectCompany() {
        List<TblCompany> companyList = tblCompanyMapper.selectCompanyName();
        return companyList;
    }
}
