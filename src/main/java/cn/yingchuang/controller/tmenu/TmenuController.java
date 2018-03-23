package cn.yingchuang.controller.tmenu;

import cn.yingchuang.entity.Tmenu;
import cn.yingchuang.service.tmenu.TmenuService;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


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


    @ResponseBody
    @RequestMapping(value = "querySecondTmenu",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String queryAllTmenu(Integer parentId,Model model){
        List<Tmenu> secondList=tmenuService.queryListTmenu(parentId);
        return JSON.toJSONString(secondList);
    }

    @RequestMapping(value = "queryFirstTmenu",method = RequestMethod.GET)
    public String queryTmenuByParentId(Model model) {
        List<Tmenu> firstList = tmenuService.queryListTmenu(0);
        model.addAttribute("firstList", firstList);
        return "addNews";
    }

    @RequestMapping("queryNameByParentId")
    public String queryNameByParentId(Integer parentId,Model model){
        List<Tmenu> list = tmenuService.queryListTmenu(parentId);
        model.addAttribute("list", list);
        return "addNews";
    }


    @RequestMapping(value = "addTmenu" ,method = RequestMethod.POST)
    public String addTmenu(Tmenu tmenu,Integer parentId, Model model){
        Integer rows = tmenuService.addTmenu(tmenu);
        if (rows>0) {
            model.addAttribute("msg", "增加成功!");
            return queryNameByParentId(0,model);
        }else{
            model.addAttribute("msg", "增加失败!");
            return queryNameByParentId(0,model);
        }
    }
}

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

