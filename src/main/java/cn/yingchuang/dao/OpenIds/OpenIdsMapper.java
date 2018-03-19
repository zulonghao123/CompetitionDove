package cn.yingchuang.dao.OpenIds;

import cn.yingchuang.entity.Members;
import cn.yingchuang.entity.OnlineMessage;
import cn.yingchuang.entity.OpenIds;

import java.util.List;

/**
 * Created by Max on 3-18-2018-018.
 */
public interface OpenIdsMapper {

    //    通过openid查实体
    public Members queryMemberByOpenId(Integer openid);

    //    添加一条信息，传入openid和实体的主键
    public Integer addOpenIds(OpenIds openIds);
}
