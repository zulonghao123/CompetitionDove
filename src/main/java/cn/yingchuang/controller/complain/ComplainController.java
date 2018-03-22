package cn.yingchuang.controller.complain;

import cn.yingchuang.entity.Complain;
import cn.yingchuang.service.Complain.ComplainService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lyr_2 on 2018/3/21.
 */
@Controller
@RequestMapping("complain")
public class ComplainController {
    @Resource
    private ComplainService complainService;

    /*查询所有*/
    @RequestMapping(value = "listComplain", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public String queryAll(Integer pageNum, Integer pageSize, Model model) {
        PageHelper.startPage(pageNum, pageSize);
        /*查询所有*/
        List<Complain> list = complainService.queryAllComplain();
        for (Complain complain : list) {
            /*大于20文中取其前17个*/
            String str = "";
            if (complain.getComplain().length() > 20) {
                str = complain.getComplain().substring(0, 17) + "...";
            } else {
                str = complain.getComplain();
            }
            complain.setComplain(str);
        }

        PageInfo<Complain> pageInfo = new PageInfo<>(list);
        model.addAttribute("pageInfo", pageInfo);

        return "complain";
    }

    /*查询一条*/
    @ResponseBody
    @RequestMapping(value = "detailComplain", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public String detailComplain(Integer id) {
        Complain complain = complainService.queryComplainById(id);
        return JSON.toJSONString(complain);
    }
}
