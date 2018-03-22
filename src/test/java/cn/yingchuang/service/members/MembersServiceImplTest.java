package cn.yingchuang.service.members;

import cn.yingchuang.entity.Information;
import cn.yingchuang.entity.Members;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MembersServiceImplTest {
    @Test
    public void addMembers1() throws Exception {
        Information information = new Information();
        information.setPlayerName("测试修改的information");
        information.setSex(1);
        information.setPhoneNumber("1010101010");
        information.setEmail("3333@qq.com");
        information.setIdNumber("111111111111111111");
        information.setSick("精神病");
        information.setDangerName("紧急");
        information.setDangerPhone("1111111111");

        information.setPayStatus(1);
        Members members = new Members();
        members.setUserName("用户名");
        members.setPassword("9999999");
        members.setNickName("昵称");
        members.setInformation(information);
        int a=membersService.addMembers(members);
        System.out.println(a);

    }


    @Test
    public void queryFuzzy() throws Exception {
        PageInfo<Members> pageInfo = membersService.queryFuzzy("用",1,10);
        List<Members> list = pageInfo.getList();
        for (Members members : list) {
            System.out.println(members);
        }
    }


    @Test
    public void queryAllMembers() throws Exception {
        PageInfo<Members> pageInfo = membersService.queryAllMembers(1, 10);
        List<Members> list = pageInfo.getList();
        System.out.println(list);
        if(list!= null){
            for (Members members : list) {
                System.out.println(members);
            }
        }
    }

    @Test
    public void queryMembersById() throws Exception {
        Members members = membersService.queryMembersById(6);
        if(members!=null){
            System.out.println(members);
        }
    }

    @Resource
    private MembersService membersService;

    /**
     * 测试修改一条会员信息的记录
     */
    @Test
    public void updateMembersById() throws Exception {
        Information information = new Information();
        information.setId(8);
        information.setPlayerName("测试修改的information");
        information.setSex(1);
        information.setPhoneNumber("1010101010");
        information.setEmail("3333@qq.com");
        information.setIdNumber("00000000");
        information.setSick("精神病");
        information.setDangerName("紧急");
        information.setDangerPhone("1111111111");
        Date date = new Date();
        information.setCreateDate(date);
        information.setPayStatus(1);
        Members members = new Members();
        members.setId(6);
        members.setUserName("用户名");
        members.setPassword("9999999");
        members.setNickName("昵称");
        members.setInformation(information);
        members.setMemberCode("101010101010");
        Integer rows = membersService.updateMembersById(members);
        if(rows>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
    }



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