package cn.yingchuang.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/18.
 */
public class Apply {
    private int id;
    private Information information;
    private Race race;
    private Date createTime;
    private String applyCode;

    @Override
    public String toString() {
        return "Apply{" +
                "id=" + id +
                ", information=" + information +
                ", race=" + race +
                ", createTime=" + createTime +
                ", applyCode='" + applyCode + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }
}
