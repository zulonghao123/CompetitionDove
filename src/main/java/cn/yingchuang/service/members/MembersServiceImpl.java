package cn.yingchuang.service.members;

import cn.yingchuang.dao.Information.InformationMapper;
import cn.yingchuang.dao.Members.MembersMapper;
import cn.yingchuang.dao.membersnum.MembersNumMapper;
import cn.yingchuang.entity.Information;
import cn.yingchuang.entity.Members;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
        //增加一条会员信息
        Integer rows = membersMapper.addMembers(members);
        //同时会员数量表要增加一条记录
        membersNumMapper.updateMembersNum();
        return rows;
    }

    @Override
    public int updateMembersById(Members members) {
        return 0;
    }

    @Override
    public Members queryMembersById(Integer id) {
        return null;
    }

    @Override
    public PageInfo<Members> queryAllMembers(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PageInfo<Members> queryFuzzy(String string, Integer pageNum, Integer pageSize) {
        return null;
    }
}
