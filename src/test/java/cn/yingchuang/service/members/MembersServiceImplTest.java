package cn.yingchuang.service.members;

import cn.yingchuang.entity.Information;
import cn.yingchuang.entity.Members;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MembersServiceImplTest {
    @Resource
    private MembersService membersService;

    /**
     * 测试增加一条会员的信息同时增加一条信息表的信息，同时会员信息的数量增加一条
     * @throws Exception
     */
    @Test
    public void addMembers() throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse("2019-09-10");
        Information information = new Information(0,"测试运动员4",1,"测试电话号","测试email","测试身份证","测试疾病","测试紧急联系人","测试紧急联系人电话",date,0);
        Integer rows = membersService.addMembers(new Members(0,"测试用户名4","测试密码","测试角色",information,"测试会员编号"));
        if(rows>0){
            System.out.println("增加会员信息成功");
        }else{
            System.out.println("增加会员信息失败");
        }
    }

}