package cn.yingchuang.controller.excel;

import cn.yingchuang.command.util.ExportExcel;
import cn.yingchuang.dao.Apply.ApplyMapper;
import cn.yingchuang.dao.Members.MembersMapper;
import cn.yingchuang.entity.Members;
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
    @Resource
    private ApplyMapper applyMapper;
    @Resource
    private MembersMapper membersMapper;

    @RequestMapping(value = "doExcel",method = RequestMethod.GET)
    public void doExcel(HttpServletResponse response, HttpServletRequest request) {
        ExportExcel<Members> userExcel = new ExportExcel<>();
        String[] headers = {"序号","赛事名称","运动员名称","性别","电话号码","电子邮箱","身份证号","病史","紧急联系人名字","创建时间","紧急联系人电话","支付状态","比赛时间","报名价格","报名编号"};
        String fileName = "会员信息表";
        List<Members> applyList = membersMapper.queryAllMembers();
        userExcel.exportExcel(headers,applyList,fileName,response);

    }

}
