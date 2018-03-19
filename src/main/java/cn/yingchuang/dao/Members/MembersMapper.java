package cn.yingchuang.dao.Members;

import cn.yingchuang.entity.Information;
import cn.yingchuang.entity.Members;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Max on 3-18-2018-018.
 */
public interface MembersMapper {

    //添加一条
    public int addMembers(Members members);

    //修改一条
    public int updateMembersById(Information information);


    //查询一条
    public Members queryMembersById(Integer id);

    //查询多条
    public List<Members> queryAllMembers();

    //模糊查询
    public List<Members> queryFuzzy(@Param("string")String string);
}
