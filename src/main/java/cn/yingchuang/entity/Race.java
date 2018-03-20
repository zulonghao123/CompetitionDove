package cn.yingchuang.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/18.
 */
public class Race {
    private int id;
    private String raceName;
    private double price;
    private Date time;
    private String raceUrl;

    public Race() {
    }

    public Race(int id, String raceName, double price, Date time, String raceUrl) {
        this.id = id;
        this.raceName = raceName;
        this.price = price;
        this.time = time;
        this.raceUrl = raceUrl;
    }



    @Override
    public String toString() {
        return "Race{" +
                "id=" + id +
                ", raceName='" + raceName + '\'' +
                ", price=" + price +
                ", time=" + time +
                ", raceUrl='" + raceUrl + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getRaceUrl() {
        return raceUrl;
    }

    public void setRaceUrl(String raceUrl) {
        this.raceUrl = raceUrl;
    }
}
