package cn.yingchuang.service.members;

import cn.yingchuang.entity.Members;
import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
public interface MembersService {
    //添加一条,在注册的时候增加一条
    public int addMembers(Members members);

    //修改一条，会员可以自己修改自己的会员信息
    public int updateMembersById(Members members);


    //查询一条,通过id查询出一条会员的信息
    public Members queryMembersById(Integer id);

    //查询多条，查询出所有的会员信息，带分页
    public PageInfo<Members> queryAllMembers(Integer pageNum,Integer pageSize);

    //模糊查询  ，页面传过来的都是string 类型的，  输入任意条件都可以查询的  ，带分页
    public PageInfo<Members> queryFuzzy(String string,Integer pageNum,Integer pageSize);


    /**
     * 前台会员登录方法
     * @param members
     * @return
     */
    Members login(Members members);
}
