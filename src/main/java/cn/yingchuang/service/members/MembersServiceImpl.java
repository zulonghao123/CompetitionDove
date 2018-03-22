package cn.yingchuang.service.members;

import cn.yingchuang.command.util.AutoCode;
import cn.yingchuang.dao.Information.InformationMapper;
import cn.yingchuang.dao.Members.MembersMapper;
import cn.yingchuang.dao.membersnum.MembersNumMapper;
import cn.yingchuang.entity.Information;
import cn.yingchuang.entity.Members;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@Service
public class MembersServiceImpl implements MembersService {
    @Resource
    private MembersMapper membersMapper;

    @Resource
    private InformationMapper informationMapper;

    @Resource
    private MembersNumMapper membersNumMapper;

    /**
     * 在增加一条会员信息的时候，information表也要同时增加一条信息
     * membersNum表的数量也要增加一条
     * @param members
     * @return
     */
    @Override
    public int addMembers(Members members) {
        //先增加一条信息表的信息  ，之后会产生一个id  给members表使用
        Information information = members.getInformation();
        informationMapper.addInformation(information);
        //将information的主键取出来  ，在赋值给members，在sql语句那里使用主键策略
        Integer id = information.getId();
        members.getInformation().setId(id);
        //同时会员数量表要增加一条记录
        membersNumMapper.updateMembersNum();
        int membersNum = membersNumMapper.queryMaxMembersNum();
        //增加一条会员信息
        membersMapper.addMembers(members);
        int membersid=members.getId();
        members.setId(membersid);
        System.out.println(members);
        AutoCode autoCode=new AutoCode();
        String membersCode=autoCode.MembersCode(members,membersNum);
        members.setMemberCode(membersCode);
        int a=membersMapper.updateMembers(members);
        return a;
    }

    /**
     * 修改一条信息的方法，，默认不修改的字段是memberCode，idNumber ，createdate
     * @param members
     * @return
     */
    @Override
    public int updateMembersById(Members members) {
        Integer rows = membersMapper.updateMembersById(members);
        return rows;
    }

    /**
     * 通过id来查询一条members的实体的信息，用来修改的时候用的，赋值在页面上
     * @param id
     * @return
     */
    @Override
    public Members queryMembersById(Integer id) {
        Members members = membersMapper.queryMembersById(id);
        return members;
    }

    /**
     * 查询所有的会员信息的方法，用来给管理员查询的时候使用的，采用分页,按照创建的时间倒序
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<Members> queryAllMembers(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Members> list = membersMapper.queryAllMembers();
        return new  PageInfo<>(list) ;
    }

    @Override
    public PageInfo<Members> queryFuzzy(String string, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Members> list = membersMapper.queryFuzzy(string);
        return new PageInfo<>(list);
    }


    /**
     * 前台会员登录方法
     * @param members
     * @return
     */
    @Override
    public Members login(Members members) {
        return membersMapper.login(members);
    }
}
