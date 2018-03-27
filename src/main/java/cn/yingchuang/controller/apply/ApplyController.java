package cn.yingchuang.controller.apply;

import cn.yingchuang.entity.Apply;
import cn.yingchuang.entity.Race;
import cn.yingchuang.service.apply.ApplyService;
import cn.yingchuang.service.race.RaceService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/21 0021.
 */
@Controller
@RequestMapping("apply")
public class ApplyController {
    @Resource
    private ApplyService applyService;
    @Resource
    private RaceService raceService;

    @RequestMapping(value = "list")
    public String queryAllApply(Integer pageNum, Integer pageSize, Model model){
        PageInfo<Apply> pageInfo = applyService.queryAllApply(pageNum, pageSize);
        List<Race> list = raceService.queryAllRace();
        model.addAttribute("race", list);
        model.addAttribute("pageInfo", pageInfo);
        return "listApply";
    }


    @RequestMapping(value = "queryApplyByRaceId")
    public String queryApplyByRaceId(Integer raceId,Integer pageNum,Integer pageSize,Model model){
        PageInfo<Apply> pageInfo = applyService.queryApplyByRaceId(raceId, pageNum, pageSize);
        model.addAttribute("pageInfo",pageInfo);
        List<Race> list = raceService.queryAllRace();
        model.addAttribute("race", list);
        model.addAttribute("raceId", raceId);
        return "listApply";
    }

    @ResponseBody
    @RequestMapping(value = "queryApplyById",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String queryApplyById(Integer applyId){
        Apply apply = applyService.queryApplyById(applyId);
        return JSON.toJSONString(apply);
    }
}
