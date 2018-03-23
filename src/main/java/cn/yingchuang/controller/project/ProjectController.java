package cn.yingchuang.controller.project;

import cn.yingchuang.entity.News;
import cn.yingchuang.service.News.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018\3\22 0022.
 */

@Controller
@RequestMapping("project")
public class ProjectController {
    @Resource
    private NewsService newsService;


    //通过二级目录，查到把新闻传递到项目页面
    @RequestMapping("doProjectDetail")
    public String doProjectDetail(Integer projectId,Model model){
        List<News> newsindex= newsService.queryNews(projectId);
        News news = newsindex.get(0);
        model.addAttribute("news", news);
        return "projectDetail";
    }
}
