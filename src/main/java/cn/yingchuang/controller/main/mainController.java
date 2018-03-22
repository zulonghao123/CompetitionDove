package cn.yingchuang.controller.main;

import cn.yingchuang.entity.News;
import cn.yingchuang.entity.Tmenu;
import cn.yingchuang.service.News.NewsService;
import cn.yingchuang.service.media.MediaService;
import cn.yingchuang.service.tmenu.TmenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
@Controller
@RequestMapping("main")
public class mainController {
    @Resource
    private TmenuService tmenuService;
    @Resource
    private MediaService mediaService;
    @Resource
    private NewsService newsService;
//    去公司简介下的二级子页面，都是死页面
@RequestMapping("toSecondPage")
public String toSecondPage(String Url){

    return Url;
}

    @RequestMapping("queryAllMain")
    public String queryAllTmenu(Model model, HttpServletRequest request, HttpServletResponse response){
        // 二级目录
        List<Tmenu> dovelist=tmenuService.queryListTmenu(1);
        List<Tmenu> projectlist=tmenuService.queryListTmenu(2);
        List<Tmenu> racelist=tmenuService.queryListTmenu(3);

        HttpSession session = request.getSession();
//        传递赛格简介的二级目录
//        model.addAttribute("dovelist", dovelist);
        session.setAttribute("dovelist", dovelist);

//        传递项目的二级目录
//        model.addAttribute("projectlist", projectlist);
        session.setAttribute("projectlist", projectlist);

        // 传递赛事的二级目录
//        model.addAttribute("racelist", racelist);
        session.setAttribute("racelist", racelist);

        //传递news
//1个图片，1个新闻，一个list

                cn.yingchuang.entity.Media media = mediaService.queryMediaById(1);
        model.addAttribute("raceMedia", media);
//        通过赛事动态查到他的子目录，然后通过parentid查到他的新闻
        List<Tmenu> tmenuList = tmenuService.queryListTmenu(8);
        List<News> newsListAll = new ArrayList<>();

        for (Tmenu tmenu : tmenuList) {
            List<News> newsindex= newsService.queryNews(tmenu.getId());
            for (News news : newsindex) {
                newsListAll.add(news);
            }
        }


if(newsListAll!=null) {
    News news = newsListAll.get(newsListAll.size() - 1);
    model.addAttribute("news", news);

    List<News> newsList = new ArrayList<>();

    newsList.add(newsListAll.get(newsListAll.size() - 2));
    newsList.add(newsListAll.get(newsListAll.size() - 3));
    newsList.add(newsListAll.get(newsListAll.size() - 4));
    model.addAttribute("newsList", newsList);
}

        return "welcome";

    }
}
