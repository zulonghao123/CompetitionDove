package cn.yingchuang.service.tmenu;

import cn.yingchuang.entity.Tmenu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TmenuServiceImplTest {
    @Resource
    private TmenuService tmenuService;
    @Test
    public void queryListTmenu() throws Exception {
        List<Tmenu> tmenus = tmenuService.queryListTmenu(1);
        for (Tmenu tmenu : tmenus) {
            System.out.println(tmenu);
        }
    }

    @Test
    public void queryTmenu() throws Exception {
        System.out.println(tmenuService.queryTmenu(1));
    }

}