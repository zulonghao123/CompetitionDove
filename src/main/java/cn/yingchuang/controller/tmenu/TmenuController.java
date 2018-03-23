package cn.yingchuang.controller.tmenu;

import cn.yingchuang.entity.Tmenu;
import cn.yingchuang.service.tmenu.TmenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
@Controller
@RequestMapping("tmenu")
public class TmenuController {
    @Resource
    private TmenuService tmenuService;
    @RequestMapping("queryAllTmenu")
    public String queryAllTmenu(Model model){
        List<Tmenu> dovelist=tmenuService.queryListTmenu(1);
        List<Tmenu> projectlist=tmenuService.queryListTmenu(2);
        List<Tmenu> racelist=tmenuService.queryListTmenu(3);
//        传递赛格简介的二级目录
        model.addAttribute("dovelist", dovelist);
//        传递项目的二级目录
        model.addAttribute("projectlist", projectlist);
        // 传递赛事的二级目录
        model.addAttribute("racelist", racelist);
        return "welcome";

    }


}