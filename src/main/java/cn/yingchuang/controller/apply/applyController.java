package cn.yingchuang.controller.apply;

import cn.yingchuang.entity.Apply;
import cn.yingchuang.entity.Information;
import cn.yingchuang.entity.Members;
import cn.yingchuang.service.apply.ApplyService;
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
@RequestMapping("apply")
public class applyController {

    @Resource
    private ApplyService applyService;

    @ResponseBody
    @RequestMapping(value = "addApplyByMember",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String addApplyByMember(Integer raceId, HttpSession session){
        Integer informationId = ((Members)session.getAttribute("loginUser")).getInformation().getId();
        Apply apply = applyService.queryApplyByRaceIdAndInformationId(raceId, informationId);
        if(apply != null){
            return JSON.toJSONString("该用户已经报名,无法重复报名");
        }
        Integer rows = applyService.addApplyByMember(raceId, informationId);
        if(rows > 0){
            return JSON.toJSONString("报名成功");
        }else{
            return JSON.toJSONString("报名失败");
        }

    }
    @ResponseBody
    @RequestMapping(value = "addApplyByNoMember",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String addApplyByNoMember(Integer raceId, String playerName,Integer sex,String phoneNumber,String Email,String sick,String dangerName,String idNumber,String dangerPhone){
        Information information = new Information();
        information.setPlayerName(playerName);
        information.setPhoneNumber(phoneNumber);
        information.setDangerPhone(dangerPhone);
        information.setSex(sex);
        information.setEmail(Email);
        information.setSick(sick);
        information.setDangerName(dangerName);
        information.setIdNumber(idNumber);

        System.out.println(information);
        Integer rows = applyService.addApplyByNoMember(raceId, information);
        if(rows > 0){
            return JSON.toJSONString("报名成功");
        }else{
            return JSON.toJSONString("报名失败");
        }
    }

}
