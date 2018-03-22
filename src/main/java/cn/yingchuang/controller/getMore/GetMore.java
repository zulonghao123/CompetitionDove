package cn.yingchuang.controller.getMore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lyr_2 on 2018/3/21.
 */
@Controller
@RequestMapping("getMore")
public class GetMore {
    @RequestMapping("getMore")
    public String getMore() {
        return "getMore";
    }
}
