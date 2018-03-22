package cn.yingchuang.controller.information;

import cn.yingchuang.command.util.Message;
import cn.yingchuang.entity.Information;
import cn.yingchuang.service.information.InformationService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by 祖龙浩 on 2018/3/21.
 */
@Controller
@RequestMapping("information")
public class InformationController {
    @Resource
    private InformationService informationService;
    @ResponseBody
    @RequestMapping(value = "addInformation",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String addInformation(Information information){
        Integer rows = informationService.addInformation(information);
        if(rows > 0){
            return JSON.toJSONString(Message.success());
        }else{
            return JSON.toJSONString(Message.error());
        }
    }
}
