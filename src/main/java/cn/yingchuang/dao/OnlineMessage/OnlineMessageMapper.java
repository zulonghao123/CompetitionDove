package cn.yingchuang.dao.OnlineMessage;

import cn.yingchuang.entity.OnlineMessage;

import java.util.List;

/**
 * Created by Max on 3-18-2018-018.
 */
public interface OnlineMessageMapper {

    //添加一条
    public int addOnlineMessage(OnlineMessage onlineMessage);

    //查询一条
    public OnlineMessage queryOnlineMessageById(Integer id);

    //查询一个list通过by状态
    public List<OnlineMessage> queryOnlineMessageByStatus(Integer id);

    //查询所有
    public List<OnlineMessage> queryAllOnlineMessage();
    //改变信息状态
    public Integer updateOnlineMessageStatus(Integer id);
}
