package cn.yingchuang.dao.Information;

import cn.yingchuang.entity.Information;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Max on 3-18-2018-018.
 */
public interface InformationMapper {

    //添加一条
    public Integer addInformation(Information information);

    //修改一条
    public Integer updateInformationById(Information information);

    //查询一条by身份证号
    public Information queryInformationByIdNumber(String idNumber);

    //查询多条
    public List<Information> queryAllInformation();


    /**
     * 根据id查身份证号
     * @param id
     * @return
     */
    String queryIdNumbersById(@Param("id") Integer id);

}
