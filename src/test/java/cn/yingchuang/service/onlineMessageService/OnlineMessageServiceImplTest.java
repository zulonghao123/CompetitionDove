package cn.yingchuang.service.onlineMessageService;

import cn.yingchuang.entity.OnlineMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class OnlineMessageServiceImplTest {
    @Test
    public void updateOnlineMessageStatus() throws Exception {
        int n=onlineMessageService.updateOnlineMessageStatus(1);
        System.out.println(n);
    }

    @Resource
    private OnlineMessageService onlineMessageService;
    @Test
    public void addOnlineMessage() throws Exception {
        OnlineMessage onlineMessage=new OnlineMessage();
        onlineMessage.setMessageForm("这个网站值得拥有");
        int n=onlineMessageService.addOnlineMessage(onlineMessage);
        System.out.println(n);

    }

    @Test
    public void queryOnlineMessageById() throws Exception {
        OnlineMessage onlineMessage=onlineMessageService.queryOnlineMessageById(1);
        if(null!=onlineMessage){
            System.out.println(onlineMessage);
        }
    }

    @Test
    public void queryOnlineMessageByStatus() throws Exception {
        List<OnlineMessage> listOnline=onlineMessageService.queryOnlineMessageByStatus(1);
        if(listOnline!=null){
            for (OnlineMessage onlineMessage : listOnline) {
                System.out.println(onlineMessage);
            }
        }
    }

    @Test
    public void queryAllOnlineMessage() throws Exception {
        List<OnlineMessage> listOnline=onlineMessageService.queryAllOnlineMessage();
        if(listOnline!=null){
            for (OnlineMessage onlineMessage : listOnline) {
                System.out.println(onlineMessage);
            }
        }
    }

}