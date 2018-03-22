package cn.yingchuang.service.apply;

import cn.yingchuang.entity.Apply;

import cn.yingchuang.entity.ApplyVo;
import cn.yingchuang.entity.Information;
import com.github.pagehelper.PageInfo;
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




/**
 * Created by Administrator on 2018/3/20 0020.
 */

    //根据身份证的信息查询一条记录，在页面的时候搜索使用的，需要使用报名表和信息表和比赛表关联
    public Apply queryApplyByIdNumber(String idNumber);

    //查询所有的报名信息  给管理员使用的需要关联information表和race表和apply表  使用分页
    public PageInfo<Apply> queryAllApply(Integer pageNum,Integer pageSize);

    //根据raceId查多个报名者的信息
    public PageInfo<Apply> queryApplyByRaceId(Integer raceId,Integer pageNum,Integer pageSize);

    //根据applyId查询一条报名信息，用于在页面的时候展示在页面上使用的
    public Apply queryApplyById(Integer applyId);

}
