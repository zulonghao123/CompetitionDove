package cn.yingchuang.service.News;

import cn.yingchuang.dao.news.NewsMapper;
import cn.yingchuang.entity.News;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Max on 3-19-2018-019.
 */
@Service
public class NewsServiceImpl implements NewsService{

    @Resource
    private NewsMapper newsMapper;

    //查询单个
    @Override
    public News queryNewsById(Integer id) {
        return newsMapper.queryNewsById(id);
    }

    //查询一组的标题和介绍
    @Override
    public List<News> queryNews(Integer tmenuId) {
        return newsMapper.queryNews(tmenuId);
    }

    @Override
    public Integer addNews(News news) {
        return newsMapper.addNews(news);
    }

    @Override
    public Integer updateNews(News news) {
        return newsMapper.updateNews(news);
    }

    @Override
    public News queryNewsByTmenuId(Integer tmenuId) {
        return newsMapper.queryNewsByTmenuId(tmenuId);
    }
}
