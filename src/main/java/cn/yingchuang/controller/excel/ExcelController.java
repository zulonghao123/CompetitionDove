package cn.yingchuang.controller.excel;

import cn.yingchuang.command.util.ExportExcel;
import cn.yingchuang.dao.Apply.ApplyMapper;
import cn.yingchuang.dao.Managers.ManagersMapper;
import cn.yingchuang.dao.Members.MembersMapper;
import cn.yingchuang.entity.ApplyVo;
import cn.yingchuang.entity.InformationVo;
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
    private MembersMapper membersMapper;


    @Resource

    private ManagersMapper managersMapper;
    @Resource
    private ApplyMapper applyMapper;

    @RequestMapping(value = "doExcelForMembers",method = RequestMethod.GET)
    public void doExcelForMembers(HttpServletResponse response, HttpServletRequest request) {
        ExportExcel<InformationVo> userExcel = new ExportExcel<>();
        String[] headers = {"序号","选手姓名","性别","手机号","邮箱","身份证号","病史","紧急联系人","紧急联系电话","创建日期","支付状态","用户名","密码","昵称","会员编号"};
        String fileName = "会员信息表";
        List<InformationVo> userList = managersMapper.queryAllMembersForExcel();
        userExcel.exportExcel(headers,userList,fileName,response);

    }

    @RequestMapping(value = "doExcelForApply",method = RequestMethod.GET)
    public void doExcelForApply(Integer raceId,HttpServletResponse response, HttpServletRequest request) {
        if(raceId == null || raceId == 0){
            raceId = null;
        }
        ExportExcel<ApplyVo> userExcel = new ExportExcel<>();
        String[] headers = {"序号","选手姓名","性别","手机号","邮箱","身份证号","病史","紧急联系人","紧急联系电话","创建日期","支付状态","赛事名称","报名费","比赛时间","报名时间","报名编号"};
        String fileName = "选手信息表";
        List<ApplyVo> userList = applyMapper.queryApplyByRaceIdForExcel(raceId);
        userExcel.exportExcel(headers,userList,fileName,response);



 
    }

}
