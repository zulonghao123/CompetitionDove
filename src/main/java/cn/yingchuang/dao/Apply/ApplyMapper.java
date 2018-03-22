package cn.yingchuang.dao.Apply;

import cn.yingchuang.entity.Apply;

import java.util.List;

/**
 * Created by Max on 3-19-2018-019.
 */
public interface ApplyMapper {

    //根据身份证的信息查询一条记录，在页面的时候搜索使用的，需要使用报名表和信息表和比赛表关联
    public Apply queryApplyByIdNumber(String idNumber);

    //查询所有的报名信息  给管理员使用的需要关联information表和race表和apply表
    public List<Apply> queryAllApply();

    //根据raceId查多个报名者的信息
    public List<Apply> queryApplyByRaceId(Integer raceId);

    //根据applyId查询一条报名信息，用于在页面的时候展示在页面上使用的
    public Apply queryApplyById(Integer applyId);

}
