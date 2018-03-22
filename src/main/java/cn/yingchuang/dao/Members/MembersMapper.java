package cn.yingchuang.dao.Members;

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
    public int updateMembersById(Members members);


    //查询一条
    public Members queryMembersById(Integer id);

    //查询多条
    public List<Members> queryAllMembers();

    //模糊查询
    public List<Members> queryFuzzy(@Param("string")String string);



    /**
     * 前台会员登录方法
     * @param members
     * @return
     */
    Members login(Members members);

    //只修改会员表
    public int updateMembers(Members members);

}
