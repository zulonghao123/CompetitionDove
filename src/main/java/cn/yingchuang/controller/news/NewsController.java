package cn.yingchuang.controller.news;

r
import cn.yingchuang.command.util.Message;
import cn.yingchuang.entity.News;
import cn.yingchuang.service.News.NewsService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/20.
 */
@Controller
@RequestMapping("news")
public class NewsController {
    @Resource
    private NewsService newsService;


    @ResponseBody
    @RequestMapping(value = "addNews",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public String addNews(News news) {
        int rows = newsService.addNews(news);
        if (rows > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }

    @ResponseBody
    @RequestMapping(value = "queryNewsByTmenuId",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String queryNews(Integer tmenuId, Model model) {
        News news = newsService.queryNewsByTmenuId(tmenuId);
        return JSON.toJSONString(news);
    }

    @ResponseBody
    @RequestMapping(value = "updateNews",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public String updateNews(News news) {
        int rows = newsService.updateNews(news);
        if (rows > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }


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
