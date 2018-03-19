package cn.yingchuang.entity;

/**
 * Created by Administrator on 2018/3/18.
 */
public class Tmenu {
    private int id;
    private String menuName;
    private String menuUrl;
    private int parentId;

    public Tmenu(int id, String menuName, String menuUrl, int parentId) {
        this.id = id;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.parentId = parentId;
    }

    public Tmenu() {
    }

    @Override
    public String toString() {
        return "Tmenu{" +
                "id=" + id +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", parentId=" + parentId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
