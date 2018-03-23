package cn.yingchuang.service.News;

import cn.yingchuang.entity.News;
import cn.yingchuang.entity.Tmenu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Max on 3-19-2018-019.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class NewsServiceImplTest {
    @Test
    public void queryNewsByTmenuId() throws Exception {
        System.out.println(newsService.queryNewsByTmenuId(6));
    }

    @Test
    public void addNews() throws Exception {
        Date date = new Date();
        Tmenu tmenu = new Tmenu();
        tmenu.setId(3);
        System.out.println(newsService.addNews(new News(0, "新闻3", "新闻新闻新闻新闻新闻新闻新闻新闻", date, tmenu, "描述")));
    }

    @Test
    public void updateNews() throws Exception {
        Tmenu tmenu = new Tmenu();
        tmenu.setId(3);
        System.out.println(newsService.updateNews(new News(0, "新闻3333", "新新", new Date(), tmenu, "描述描述描述描述")));
    }

    @Resource
    private NewsService newsService;

    //查询一条
    @Test
    public void queryNewsById() throws Exception {
        System.out.println(newsService.queryNewsById(1));
    }

    //查询一组的标题和介绍
    @Test
    public void queryNews() throws Exception {
        System.out.println(newsService.queryNews(3));
    }

}