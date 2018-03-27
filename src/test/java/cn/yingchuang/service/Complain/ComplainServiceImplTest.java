package cn.yingchuang.service.Complain;

import cn.yingchuang.entity.Complain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018\3\19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ComplainServiceImplTest {
    @Resource
    private ComplainService complainService;
    @Test
    public void addComplain() throws Exception {
        Complain complain = new Complain();
        complain.setComplain("投诉测试1");
        Integer n = complainService.addComplain(complain);
        System.out.println(n);
    }

    @Test
    public void queryComplainById() throws Exception {
        Complain complain = complainService.queryComplainById(1);
        System.out.println(complain);
    }

}