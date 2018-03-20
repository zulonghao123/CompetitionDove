package cn.yingchuang.service.News;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Max on 3-19-2018-019.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class NewsServiceImplTest {

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