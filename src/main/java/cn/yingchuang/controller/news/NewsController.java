package cn.yingchuang.controller.news;

import cn.yingchuang.entity.News;
import cn.yingchuang.service.News.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/20.
 */
@Controller
@RequestMapping("news")
public class NewsController {
    @Resource
    private NewsService newsService;

@RequestMapping("doNewsDetail")
    public String doNewsDetail(
            Integer newId,
            Model model
){

    News news = newsService.queryNewsById(newId);
    System.out.println(news);

    model.addAttribute("news", news);
    return "newsDetail";
}
}
