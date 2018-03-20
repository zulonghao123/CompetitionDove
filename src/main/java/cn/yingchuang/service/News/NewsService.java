package cn.yingchuang.service.News;

import cn.yingchuang.entity.News;

import java.util.List;

/**
 * Created by Max on 3-19-2018-019.
 */
public interface NewsService {

    //查询单个
    public News queryNewsById(Integer id);

    //查询一组的标题和介绍
    public List<News> queryNews(Integer tmenuId);
}
