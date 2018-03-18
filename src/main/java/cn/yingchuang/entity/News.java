package cn.yingchuang.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/18.
 */
public class News {
    private int newid;
    private String title;
    private String newsContent;
    private Date createDate;
    private Tmenu tmenu;
    private String introduce;

    @Override
    public String toString() {
        return "News{" +
                "newid=" + newid +
                ", title='" + title + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", createDate=" + createDate +
                ", tmenu=" + tmenu +
                ", introduce='" + introduce + '\'' +
                '}';
    }

    public int getNewid() {
        return newid;
    }

    public void setNewid(int newid) {
        this.newid = newid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Tmenu getTmenu() {
        return tmenu;
    }

    public void setTmenu(Tmenu tmenu) {
        this.tmenu = tmenu;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
