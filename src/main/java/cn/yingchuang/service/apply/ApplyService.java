package cn.yingchuang.service.apply;

import cn.yingchuang.entity.Apply;
import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
public interface ApplyService {
    //根据身份证的信息查询一条记录，在页面的时候搜索使用的，需要使用报名表和信息表和比赛表关联
    public Apply queryApplyByIdNumber(String idNumber);

    //查询所有的报名信息  给管理员使用的需要关联information表和race表和apply表  使用分页
    public PageInfo<Apply> queryAllApply(Integer pageNum,Integer pageSize);

    //根据raceId查多个报名者的信息
    public PageInfo<Apply> queryApplyByRaceId(Integer raceId,Integer pageNum,Integer pageSize);

    //根据applyId查询一条报名信息，用于在页面的时候展示在页面上使用的
    public Apply queryApplyById(Integer applyId);
}
