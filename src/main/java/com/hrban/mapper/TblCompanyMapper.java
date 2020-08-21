package com.hrban.mapper;

import com.hrban.bean.TblCompany;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 企业档案 Mapper 接口
 * </p>
 *
 * @author hrban
 * @since 2020-08-18
 */
@Component
public interface TblCompanyMapper extends BaseMapper<TblCompany> {

    public List<TblCompany> selectCompanyName();

}
