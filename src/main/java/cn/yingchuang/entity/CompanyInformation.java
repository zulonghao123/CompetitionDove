package cn.yingchuang.entity;

/**
 * Created by Administrator on 2018/3/18.
 */
public class CompanyInformation {
    private int id;
    private String phoneNumber;
    private String email;
    private String address;

    public CompanyInformation(int id, String phoneNumber, String email, String address) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public CompanyInformation() {
    }

    @Override
    public String toString() {
        return "CompanyInformation{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
