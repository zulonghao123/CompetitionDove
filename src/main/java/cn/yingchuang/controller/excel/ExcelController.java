package cn.yingchuang.controller.excel;

import cn.yingchuang.command.util.ExportExcel;
import cn.yingchuang.entity.Race;
import cn.yingchuang.service.race.RaceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by 祖龙浩 on 2018/3/20.
 */
@Controller
@RequestMapping("excel")
public class ExcelController {

    @Resource
    private RaceService raceService;

    @RequestMapping(value = "doExcel",method = RequestMethod.GET)
    public void doExcel(HttpServletResponse response, HttpServletRequest request) {
        ExportExcel<Race> userExcel = new ExportExcel<>();
        String[] headers = {"序号","赛事名称","报名价格","报名时间"};
        String fileName = "赛事信息表";
        List<Race> userList = raceService.queryAllRace();
        userExcel.exportExcel(headers,userList,fileName,response);

    }

}
