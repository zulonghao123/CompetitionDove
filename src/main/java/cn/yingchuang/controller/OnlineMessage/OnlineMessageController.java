package cn.yingchuang.controller.OnlineMessage;

import cn.yingchuang.entity.OnlineMessage;
import cn.yingchuang.service.onlineMessageService.OnlineMessageService;
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
@RequestMapping("OnlineMessage")
public class OnlineMessageController {
    @Resource
    private OnlineMessageService onlineMessageService;

    @RequestMapping(value = "queryAll", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public String queryAllList(Integer pageNum, Integer pageSize, Model model) {
        PageHelper.startPage(pageNum, pageSize);
        List<OnlineMessage> list = onlineMessageService.queryAllOnlineMessage();
        PageInfo<OnlineMessage> pageInfo = new PageInfo<>(list);
        model.addAttribute("pageInfo", pageInfo);
        return "OnlineMessage";
    }

    @ResponseBody
    @RequestMapping(value = "detailOnlineMessage", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public String detailOnlineMessage(Integer id) {
        onlineMessageService.updateOnlineMessageStatus(id);
        OnlineMessage onlineMessage = onlineMessageService.queryOnlineMessageById(id);
        return JSON.toJSONString(onlineMessage);

    }


}
