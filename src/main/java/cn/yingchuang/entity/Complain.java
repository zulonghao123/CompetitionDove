package cn.yingchuang.entity;

/**
 * Created by Administrator on 2018/3/18.
 */
public class Complain {
    private int id;
    private String complain;

    @Override
    public String toString() {
        return "Complain{" +
                "id=" + id +
                ", complain='" + complain + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }
}
