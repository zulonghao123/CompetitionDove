package cn.yingchuang.entity;

/**
 * Created by Administrator on 2018/3/18.
 */
public class Media {
    private int id;
    private String mediaName;
    private String messaage;
    private String mediaUrl;
    private int mediaParentId;

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", mediaName='" + mediaName + '\'' +
                ", messaage='" + messaage + '\'' +
                ", mediaUrl='" + mediaUrl + '\'' +
                ", mediaParentId=" + mediaParentId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getMessaage() {
        return messaage;
    }

    public void setMessaage(String messaage) {
        this.messaage = messaage;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public int getMediaParentId() {
        return mediaParentId;
    }

    public void setMediaParentId(int mediaParentId) {
        this.mediaParentId = mediaParentId;
    }
}
