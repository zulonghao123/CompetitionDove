package cn.yingchuang.entity;

import java.util.Date;

/**
 * Created by 祖龙浩 on 2018/3/22.
 */
public class ApplyVo {
    private int id;
    private String playerName;
    private int sex;
    private String phoneNumber;
    private String Email;
    private String idNumber;
    private String sick;
    private String dangerName;
    private String dangerPhone;
    private Date createDate;
    private int payStatus;


    private String raceName;
    private double price;
    private Date time;

    private Date createTime;
    private String applyCode;

    public ApplyVo() {
    }

    public ApplyVo(int id, String playerName, int sex, String phoneNumber, String email, String idNumber, String sick, String dangerName, String dangerPhone, Date createDate, int payStatus, String raceName, double price, Date time, Date createTime, String applyCode) {
        this.id = id;
        this.playerName = playerName;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        Email = email;
        this.idNumber = idNumber;
        this.sick = sick;
        this.dangerName = dangerName;
        this.dangerPhone = dangerPhone;
        this.createDate = createDate;
        this.payStatus = payStatus;
        this.raceName = raceName;
        this.price = price;
        this.time = time;
        this.createTime = createTime;
        this.applyCode = applyCode;
    }

    @Override
    public String toString() {
        return "ApplyVo{" +
                "id=" + id +
                ", playerName='" + playerName + '\'' +
                ", sex=" + sex +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", sick='" + sick + '\'' +
                ", dangerName='" + dangerName + '\'' +
                ", dangerPhone='" + dangerPhone + '\'' +
                ", createDate=" + createDate +
                ", payStatus=" + payStatus +
                ", raceName='" + raceName + '\'' +
                ", price=" + price +
                ", time=" + time +
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

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getSick() {
        return sick;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }

    public String getDangerName() {
        return dangerName;
    }

    public void setDangerName(String dangerName) {
        this.dangerName = dangerName;
    }

    public String getDangerPhone() {
        return dangerPhone;
    }

    public void setDangerPhone(String dangerPhone) {
        this.dangerPhone = dangerPhone;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
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
