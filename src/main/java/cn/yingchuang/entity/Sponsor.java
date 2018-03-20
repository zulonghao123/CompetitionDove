package cn.yingchuang.entity;

/**
 * Created by Administrator on 2018/3/18.
 */
public class Sponsor {
    private int id;
    private String sponsorName;
    private Media media;
    private String sponsorUrl;

    public Sponsor(int id, String sponsorName, Media media, String sponsorUrl) {
        this.id = id;
        this.sponsorName = sponsorName;
        this.media = media;
        this.sponsorUrl = sponsorUrl;
    }

    public Sponsor() {
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "id=" + id +
                ", sponsorName='" + sponsorName + '\'' +
                ", media=" + media +
                ", sponsorUrl='" + sponsorUrl + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getSponsorUrl() {
        return sponsorUrl;
    }

    public void setSponsorUrl(String sponsorUrl) {
        this.sponsorUrl = sponsorUrl;
    }
}
