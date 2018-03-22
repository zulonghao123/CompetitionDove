package cn.yingchuang.service.Managers;

import cn.yingchuang.dao.Managers.ManagersMapper;
import cn.yingchuang.entity.InformationVo;
import cn.yingchuang.entity.Managers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018\3\19 0019.
 */
@Service
public class ManagersServiceImpl implements ManagersService {
    @Resource
    private ManagersMapper managersMapper;
    //添加一条
    public int addManagers(Managers managers) {
        return managersMapper.addManagers(managers);
    }
    //查询一条for管理权限
    public Managers queryManagersById(Integer id) {

        return managersMapper.queryManagersById(id);
    }
    //登录
    public Managers loginManagers(Managers managers) {
        return managersMapper.loginManagers(managers);
    }
    //修改
    public int updateManagersById(Managers managers) {
        return managersMapper.updateManagersById(managers);
    }

    @Override
    public List<InformationVo> queryAllMembersForExcel() {
        return managersMapper.queryAllMembersForExcel();
    }
        @Override
    public List<Managers> queryAll() {
        return managersMapper.queryAll();

    }
}
