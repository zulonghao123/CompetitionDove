package cn.yingchuang.dao.Apply;

import cn.yingchuang.entity.Apply;
import cn.yingchuang.entity.ApplyVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Max on 3-19-2018-019.
 */
public interface ApplyMapper {

    //添加
    public Integer addApply(Apply apply);

    //查询所有
    public List<Apply> queryAllApply();

    //按id修改applyCode
    Integer updateApply(Apply apply);

    /**
     * 按赛事id和信息id查询是否已经报名
     * @param raceId
     * @param informationId
     * @return
     */
    Apply queryApplyByRaceIdAndInformationId(@Param("raceId") Integer raceId, @Param("informationId") Integer informationId);


    /**
     * 按赛事id查询ApplyVo
     * @param raceId
     * @return
     */
    List<ApplyVo> queryApplyByRaceIdForExcel(@Param("raceId") Integer raceId);


}
