package cn.yingchuang.controller.goToMain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lyr_2 on 2018/3/21.
 */
@Controller
@RequestMapping("goToMain")
public class GoToMain {
    @RequestMapping("goToMain")
    public String goToMain() {
        /*返回主页面*/
        return "";
    }
}
