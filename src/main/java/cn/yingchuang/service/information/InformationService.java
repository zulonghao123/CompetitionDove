package cn.yingchuang.service.information;

import cn.yingchuang.entity.Information;

/**
 * Created by 祖龙浩 on 2018/3/21.
 */
public interface InformationService {
    //添加一条
    public Integer addInformation(Information information);

    //查询一条by身份证号
    public Information queryInformationByIdNumber(String idNumber);
}
