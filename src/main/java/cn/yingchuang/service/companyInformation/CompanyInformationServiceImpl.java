package cn.yingchuang.service.companyInformation;

import cn.yingchuang.dao.companyInformation.CompanyInformationMapper;
import cn.yingchuang.entity.CompanyInformation;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 朱博文 on 2018/3/19.
 */
@Service
public class CompanyInformationServiceImpl implements CompanyInformationService {
    @Resource
    private CompanyInformationMapper companyInformationMapper;

    public PageInfo<CompanyInformation> queryAllCompanyInformation(Integer pageNum, Integer pageSiz) {
        PageHelper.startPage(pageSiz,pageNum);
        List<CompanyInformation> list=companyInformationMapper.queryAllCompanyInformation();

        return new PageInfo<CompanyInformation>(list);
    }
}
