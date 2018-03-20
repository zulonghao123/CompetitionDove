package cn.yingchuang.entity;

/**
 * Created by Administrator on 2018\3\19 0019.
 */
public class OpenIds {
    private Integer id;
    private String openId;
    private Members members;

    public OpenIds(Integer id, String openId, Members members) {
        this.id = id;
        this.openId = openId;
        this.members = members;
    }

    public OpenIds() {
    }

    @Override
    public String toString() {
        return "OpenIds{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", members=" + members +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }
}
