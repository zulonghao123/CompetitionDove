package cn.yingchuang.controller.members;


import cn.yingchuang.command.util.Message;
import cn.yingchuang.entity.Members;
import cn.yingchuang.service.members.MembersService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;

import cn.yingchuang.entity.Members;
import cn.yingchuang.service.members.MembersService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import javax.servlet.http.HttpSession;

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



    /**
     * 点击会员信息的按钮跳转的controller 用于在页面显示列表的时候使用的
     * 展示所有的会员信息
     * @param pageNum
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("list")
    public String queryAllMembers(Integer pageNum, Integer pageSize, Model model){
        PageInfo<Members> pageInfo = membersService.queryAllMembers(pageNum, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "listMembers";
    }

    /**
     * 根据会员的主键查询出一条信息的时候使用的controller
     * 用与在页面点击详情的时候展示模态框的时候使用的
     * @param membersId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "queryMembersById",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String queryMembersById(Integer membersId){
        Members members = membersService.queryMembersById(membersId);
        System.out.println(members);
        return JSON.toJSONString(members);
    }

    /**
     * 模糊查询的方法，
     * @param shuru
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "queryFuzzy")
    public String queryFuzzy(String shuru, Integer pageNum, Integer pageSize, Model model){
        PageInfo<Members> pageInfo = membersService.queryFuzzy(shuru, pageNum, pageSize);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("shuru", shuru);
        return "listMembers";
    }




}
