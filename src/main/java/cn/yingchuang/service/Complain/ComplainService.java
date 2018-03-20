package cn.yingchuang.service.Complain;

import cn.yingchuang.entity.Complain;

/**
 * Created by Max on 3-18-2018-018.
 */
public interface ComplainService {

    //添加一条
    public int addComplain(Complain complain);

    //查询一条
    public Complain queryComplainById(Integer id);
}
