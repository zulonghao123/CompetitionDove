package cn.yingchuang.controller;

import cn.yingchuang.entity.Members;
import cn.yingchuang.service.members.MembersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
@Controller
@RequestMapping("members")
public class MembersController {
    @Resource
    private MembersService membersService;

    @ResponseBody
    @RequestMapping(value = "addMembers",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public void addMembers(Members members){
        System.out.println(members);
        Integer rows = membersService.addMembers(members);

        if(rows>0){
            System.out.println("增加成功");
        }else{
            System.out.println("增加失败");
        }
    }
}
