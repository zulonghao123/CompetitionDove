package cn.yingchuang.service.Complain;

import cn.yingchuang.entity.Complain;

import java.util.List;

/**
 * Created by Max on 3-18-2018-018.
 */
public interface ComplainService {

    //添加一条
    public int addComplain(Complain complain);

    //查询一条
    public Complain queryComplainById(Integer id);

    /*查询所有*/
    public List<Complain> queryAllComplain();


}
