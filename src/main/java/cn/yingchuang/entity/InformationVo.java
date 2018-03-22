package cn.yingchuang.entity;

import java.util.Date;

/**
 * Created by 祖龙浩 on 2018/3/22.
 */
public class InformationVo  {
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
    private String userName;
    private String password;
    private String nickName;
    private String memberCode;

    public InformationVo() {
    }

    public InformationVo(int id, String playerName, int sex, String phoneNumber, String email, String idNumber, String sick, String dangerName, String dangerPhone, Date createDate, int payStatus, String userName, String password, String nickName, String memberCode) {
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
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.memberCode = memberCode;
    }

    @Override
    public String toString() {
        return "InformationVo{" +
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
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", memberCode='" + memberCode + '\'' +
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }
}
