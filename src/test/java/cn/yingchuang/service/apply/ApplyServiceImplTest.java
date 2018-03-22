package cn.yingchuang.service.apply;

import cn.yingchuang.entity.ApplyVo;
import cn.yingchuang.entity.Information;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 祖龙浩 on 2018/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ApplyServiceImplTest {
    @Test
    public void queryApplyByRaceIdForExcel() throws Exception {
        Integer raceId = null;
        List<ApplyVo> list = applyService.queryApplyByRaceIdForExcel(1);
        for (ApplyVo applyVo : list) {
            System.out.println(applyVo);
        }
    }

    @Test
    public void addApplyByNoMember() throws Exception {
        Information information = new Information();
        information.setPlayerName("祖龙浩");
        information.setSex(0);
        information.setPhoneNumber("15811532781");
        information.setEmail("zlh891116@sina.com");
        information.setIdNumber("110106198911161216");
        information.setSick("无");
        information.setDangerName("工人");
        information.setDangerPhone("63265383");
        information.setPayStatus(1);
        Integer rows = applyService.addApplyByNoMember(7,information);
    }

    @Resource
    private ApplyService applyService;
    @Test
    public void addApplyByMember() throws Exception {
        Integer rows = applyService.addApplyByMember(7, 4);
        System.out.println(rows);
    }

}