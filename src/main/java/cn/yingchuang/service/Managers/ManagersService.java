package cn.yingchuang.service.Managers;

import cn.yingchuang.entity.InformationVo;
import cn.yingchuang.entity.Managers;

import java.util.List;

/**
 * Created by Max on 3-18-2018-018.
 */
public interface ManagersService {

    //添加一条
    public int addManagers(Managers managers);

    //查询一条for管理权限
    public Managers queryManagersById(Integer id);

    //登录
    public Managers loginManagers(Managers managers);

    //修改
    public int updateManagersById(Managers managers);


    /**
     * 导出数据表的方法
     * @return
     */
    List<InformationVo> queryAllMembersForExcel();

    //查所有
    public List<Managers> queryAll();

}
