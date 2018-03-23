package cn.yingchuang.service.tmenu;

import cn.yingchuang.entity.Tmenu;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface TmenuService {
    //按照parentId查询所有目录
    public List<Tmenu> queryListTmenu(Integer parentId);
    //查询一条目录
    public Tmenu queryTmenu(Integer id);

    //增加一条二级标题的方法
    public Integer addTmenu(Tmenu tmenu);





}
