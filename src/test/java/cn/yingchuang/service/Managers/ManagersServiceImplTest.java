package cn.yingchuang.service.Managers;

import cn.yingchuang.entity.Managers;
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
public class ManagersServiceImplTest {
    @Resource
    private ManagersService managersService;
    @Test
    public void addManagers() throws Exception {
        Managers managers = new Managers();
        managers.setAdminName("testmanager1");
        managers.setPassword("asdf");
        managers.setPower(3);
        Integer n = managersService.addManagers(managers);
        System.out.println(n);
    }

    @Test
    public void queryManagersById() throws Exception {
        System.out.println(managersService.queryManagersById(4));
    }

    @Test
    public void loginManagers() throws Exception {
        Managers managers = new Managers();
        managers.setAdminName("testmanager1");
        managers.setPassword("asdf");
        managers.setPower(3);

        System.out.println(managersService.loginManagers(managers));
    }

    @Test
    public void updateManagersById() throws Exception {
        Managers managers = new Managers();
        managers.setStatus(0);
        managers.setId(4);
        System.out.println(managersService.updateManagersById(managers));

    }

}