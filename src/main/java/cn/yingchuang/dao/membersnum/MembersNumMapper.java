package cn.yingchuang.dao.membersnum;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
public interface MembersNumMapper {
    //查询出会员数量表的记录数的最大值
    public Integer queryMaxMembersNum();

    //修改会员数量的值，在每增加一个会员的时候，会员数量表的membersNum字段加一
    public Integer updateMembersNum();

}
