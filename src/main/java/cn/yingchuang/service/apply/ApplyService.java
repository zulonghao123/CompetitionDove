package cn.yingchuang.service.apply;

import cn.yingchuang.entity.Apply;
import cn.yingchuang.entity.ApplyVo;
import cn.yingchuang.entity.Information;

import java.util.List;

/**
 * Created by 祖龙浩 on 2018/3/20.
 */
public interface ApplyService {

    /**
     *  会员报名比赛的方法(apply表增加)
     * @param raceId 赛事id
     * @param informationId 信息表id
     * @return
     */
    Integer addApplyByMember(Integer raceId,Integer informationId);

    /**
     *  非会员报名参加比赛
     * @param raceId 赛事id
     * @param information 报名前要添加的information
     * @return
     */
    Integer addApplyByNoMember(Integer raceId, Information information);

    /**
     * 按赛事id和信息id查询是否已经报名
     * @param raceId
     * @param informationId
     * @return
     */
    Apply queryApplyByRaceIdAndInformationId(Integer raceId, Integer informationId);

    /**
     * 按赛事id查询ApplyVo
     * @param raceId
     * @return
     */
    List<ApplyVo> queryApplyByRaceIdForExcel(Integer raceId);



}
