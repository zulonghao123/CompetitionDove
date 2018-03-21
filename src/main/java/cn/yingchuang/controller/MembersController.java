package cn.yingchuang.controller;

import cn.yingchuang.service.members.MembersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
@Controller
@RequestMapping("members")
public class MembersController {
    @Resource
    private MembersService membersService;


    @RequestMapping(value = "addMembers")
    public String addMembers(){
        return "index31";
    }

}
