package cn.yingchuang.entity;

/**
 * Created by Administrator on 2018/3/18.
 */
public class MembersNum {
    private int id;
    private int membersNum;

    public MembersNum(int id, int membersNum) {
        this.id = id;
        this.membersNum = membersNum;
    }

    public MembersNum() {
    }

    @Override
    public String toString() {
        return "MembersNum{" +
                "id=" + id +
                ", membersNum=" + membersNum +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMembersNum() {
        return membersNum;
    }

    public void setMembersNum(int membersNum) {
        this.membersNum = membersNum;
    }
}
