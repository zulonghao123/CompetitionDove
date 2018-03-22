package cn.yingchuang.controller.members;

import cn.yingchuang.command.util.Message;
import cn.yingchuang.entity.Members;
import cn.yingchuang.service.members.MembersService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by 祖龙浩 on 2018/3/20.
 */
@Controller
@RequestMapping("members")
public class MembersController {

    @Resource
    private MembersService membersService;

    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public String login(Members members, HttpSession session) {

        Members loginUser = membersService.login(members);

        if(loginUser != null){
            session.setAttribute("loginUser",loginUser);
            return JSON.toJSONString(Message.success());
        }else{
            return JSON.toJSONString(Message.error());
        }
    }

}
