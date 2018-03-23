package cn.yingchuang.dao.news;

import cn.yingchuang.entity.News;

import java.util.List;

/**
 * Created by Administrator on 2018/3/18.
 */
public interface NewsMapper {
//    查询单个
    public News queryNewsById(Integer id);

    //查询一组的标题和介绍
    public List<News> queryNews(Integer tmenuId);

    //添加新闻
    public Integer addNews(News news);

    //修改新闻
    public Integer updateNews(News news);

    //查询一条
    public News queryNewsByTmenuId(Integer tmenuId);
}
