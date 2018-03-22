package cn.yingchuang.service.apply;

import cn.yingchuang.dao.Apply.ApplyMapper;
import cn.yingchuang.entity.Apply;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
@Service
public class ApplyServiceImpl implements ApplyService {
    @Resource
    private ApplyMapper applyMapper;
    @Override
    public Apply queryApplyByIdNumber(String idNumber) {
        return applyMapper.queryApplyByIdNumber(idNumber);
    }

    @Override
    public PageInfo<Apply> queryAllApply(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Apply> list= applyMapper.queryAllApply();
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<Apply> queryApplyByRaceId(Integer raceId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Apply> list = applyMapper.queryApplyByRaceId(raceId);
        return new PageInfo<>(list);
    }

    @Override
    public Apply queryApplyById(Integer applyId) {
        return applyMapper.queryApplyById(applyId);
    }

}
