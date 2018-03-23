package cn.yingchuang.controller.main;

import cn.yingchuang.entity.Media;
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

        Media media = mediaService.queryMediaById(1);
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

//项目专区需要三个图片和三个项目专区二级目录里的三个
        if (projectlist.size()>=3){

            Tmenu tmenu1 = projectlist.get(projectlist.size() - 1);
            Tmenu tmenu2 = projectlist.get(projectlist.size() - 2);
            Tmenu tmenu3 = projectlist.get(projectlist.size() - 3);

            model.addAttribute("tmenu1", tmenu1);
            model.addAttribute("tmenu2", tmenu2);
            model.addAttribute("tmenu3", tmenu3);

            Media media1 = mediaService.queryMediaByMediaMessage(""+tmenu1.getId());
            Media media2 = mediaService.queryMediaByMediaMessage(""+tmenu2.getId());
            Media media3 = mediaService.queryMediaByMediaMessage(""+tmenu3.getId());

            model.addAttribute("project1", media1);
            model.addAttribute("project2", media2);
            model.addAttribute("project3", media3);
        }

//首页轮播图
        Media lunBoTu1 = mediaService.queryMediaByMediaMessage("轮播图1");
        Media lunBoTu2 = mediaService.queryMediaByMediaMessage("轮播图2");
        Media lunBoTu3 = mediaService.queryMediaByMediaMessage("轮播图3");
        List<Media> lunBoTuList = new ArrayList<>();

        System.out.println(lunBoTu1);

        lunBoTuList.add(lunBoTu1);
        lunBoTuList.add(lunBoTu2);
        lunBoTuList.add(lunBoTu3);

        model.addAttribute("lunBoTuList", lunBoTuList);
//        首页视频
        Media video = mediaService.queryMediaByMediaMessage("首页视频");
        Media videoPhoto = mediaService.queryMediaByMediaMessage("首页视频封面");
        model.addAttribute("video", video);
        model.addAttribute("videoPhoto", videoPhoto);



        return "welcome";

    }
}
