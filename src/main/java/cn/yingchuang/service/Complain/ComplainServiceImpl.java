package cn.yingchuang.service.Complain;

import cn.yingchuang.dao.Complain.ComplainMapper;
import cn.yingchuang.entity.Complain;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018\3\19 0019.
 */
@Service
public class ComplainServiceImpl implements ComplainService {
    @Resource
    private ComplainMapper complainMapper;
    //添加一条
    public int addComplain(Complain complain) {
        return complainMapper.addComplain(complain);
    }
    //查询一条
    public Complain queryComplainById(Integer id) {
        return complainMapper.queryComplainById(id);
    }

    @Override
    public List<Complain> queryAllComplain() {
        return complainMapper.queryAllComplain();
    }
}
