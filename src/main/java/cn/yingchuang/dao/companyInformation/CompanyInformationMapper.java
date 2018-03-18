package cn.yingchuang.dao.companyInformation;

import cn.yingchuang.entity.CompanyInformation;

import java.util.List;

/**
 * Created by Administrator on 2018/3/18.
 */
public interface CompanyInformationMapper {
    //查询所有公司信息
    public List<CompanyInformation> queryAllCompanyInformation();
}
