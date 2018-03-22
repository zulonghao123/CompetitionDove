package cn.yingchuang.controller.managers;

import cn.yingchuang.command.util.Message;
import cn.yingchuang.entity.Managers;
import cn.yingchuang.service.Managers.ManagersService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */@Controller
@RequestMapping("managers")
public class ManagersController {
     @Resource
    private ManagersService managersService;

     @RequestMapping("login")
    public String login(Managers managers, HttpSession httpSession,Model model){
        Managers login=managersService.loginManagers(managers);
        if(login!=null){
            if(login.getStatus()==0){
                httpSession.setAttribute("login",login);
                return "main";
            }
            model.addAttribute("message","账户已经被冻结");
            return "index";
        }
        model.addAttribute("message","用户名或者密码错误");
        return "index";

     }

    @RequestMapping(value = "logout")
    public String logout(HttpSession session) {
        session.removeAttribute("login");
        return "index";
    }

    @RequestMapping("toFreeze")
    public String toFreeze(Model model){
        List<Managers> list=managersService.queryAll();
        model.addAttribute("managerList",list);
        return "listManager";
    }

    @ResponseBody
    @RequestMapping(value = "freezeManager",method = RequestMethod.GET,
            produces ="application/json;charset=utf-8" )
    public String freezeManager(int id){
        Managers managers=new Managers();
        managers.setId(id);
        int a=managersService.updateManagersById(managers);
        if(a>0){
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }

    @RequestMapping("toManager")
    public String toManager(){
        return "main";
    }



}
