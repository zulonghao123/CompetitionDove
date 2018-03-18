package cn.yingchuang.entity;

/**
 * Created by Administrator on 2018/3/18.
 */
public class ApplyNum {
    private int id;
    private int applyNum;

    @Override
    public String toString() {
        return "ApplyNum{" +
                "id=" + id +
                ", applyNum=" + applyNum +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(int applyNum) {
        this.applyNum = applyNum;
    }
}
