package cn.yingchuang.entity;

/**
 * Created by Administrator on 2018/3/18.
 */
public class OnlineMessage {
    private int id;
    private String messageForm;
    private int status;

    @Override
    public String toString() {
        return "OnlineMessage{" +
                "id=" + id +
                ", messageForm='" + messageForm + '\'' +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageForm() {
        return messageForm;
    }

    public void setMessageForm(String messageForm) {
        this.messageForm = messageForm;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
