package cn.yingchuang.service.onlineMessageService;

import cn.yingchuang.dao.OnlineMessage.OnlineMessageMapper;
import cn.yingchuang.entity.OnlineMessage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
@Service
public class OnlineMessageServiceImpl implements OnlineMessageService {
    @Resource
    private OnlineMessageMapper onlineMessageMapper;
    //添加在线留言测试通过默认状态是0未查看
    @Override
    public int addOnlineMessage(OnlineMessage onlineMessage) {
        return onlineMessageMapper.addOnlineMessage(onlineMessage);
    }
    //通过id查询在线留言测试通过
    @Override
    public OnlineMessage queryOnlineMessageById(Integer id) {
        return onlineMessageMapper.queryOnlineMessageById(id);
    }
    //通过状态查询在线留言测试通过
    @Override
    public List<OnlineMessage> queryOnlineMessageByStatus(Integer id) {
      return onlineMessageMapper.queryOnlineMessageByStatus(id);
    }
    //查询所有留言测试通过
    @Override
    public List<OnlineMessage> queryAllOnlineMessage() {

        return onlineMessageMapper.queryAllOnlineMessage();
    }
    //通过id改变状态status测试通过
    @Override
    public Integer updateOnlineMessageStatus(Integer id) {
        return onlineMessageMapper.updateOnlineMessageStatus(id);
    }
}
