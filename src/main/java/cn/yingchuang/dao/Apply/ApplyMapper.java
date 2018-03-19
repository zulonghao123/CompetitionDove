package cn.yingchuang.dao.Apply;

import cn.yingchuang.entity.Apply;

import java.util.List;

/**
 * Created by Max on 3-19-2018-019.
 */
public interface ApplyMapper {

    //添加
    public int addApply(Apply apply);

    //查询所有
    public List<Apply> queryAllApply();
}
