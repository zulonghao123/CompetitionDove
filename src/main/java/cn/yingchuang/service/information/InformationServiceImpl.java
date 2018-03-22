package cn.yingchuang.service.information;

import cn.yingchuang.dao.Information.InformationMapper;
import cn.yingchuang.entity.Information;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 祖龙浩 on 2018/3/21.
 */
@Controller
@RequestMapping("information")
public class InformationServiceImpl implements InformationService {
    @Resource
    private InformationMapper informationMapper;
    @Override
    public Integer addInformation(Information information) {
        return informationMapper.addInformation(information);
    }

    @Override
    public Information queryInformationByIdNumber(String idNumber) {
        return informationMapper.queryInformationByIdNumber(idNumber);
    }
}
