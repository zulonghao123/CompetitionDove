package cn.yingchuang.service.apply;


import cn.yingchuang.command.util.AutoCode;
import cn.yingchuang.dao.Apply.ApplyMapper;
import cn.yingchuang.dao.ApplyNum.ApplyNumMapper;
import cn.yingchuang.dao.Information.InformationMapper;
import cn.yingchuang.entity.Apply;
import cn.yingchuang.entity.ApplyVo;
import cn.yingchuang.entity.Information;
import cn.yingchuang.entity.Race;

import cn.yingchuang.dao.Apply.ApplyMapper;
import cn.yingchuang.entity.Apply;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**

 * Created by 祖龙浩 on 2018/3/20.
 */
@Service
public class ApplyServiceImpl implements ApplyService {

    @Resource
    private ApplyMapper applyMapper;
    @Resource
    private ApplyNumMapper applyNumMapper;
    @Resource
    private InformationMapper informationMapper;
    


    @Override
    public Integer addApplyByMember(Integer raceId, Integer informationId) {
        Apply apply = new Apply();

        Race race = new Race();
        race.setId(raceId);

        Information information = new Information();
        information.setId(informationId);
        information.setIdNumber(informationMapper.queryIdNumbersById(informationId));
        apply.setApplyCode("applyCode");
        apply.setInformation(information);
        apply.setRace(race);

        //通过主键策略,获取添加apply的id
        Integer row = applyMapper.addApply(apply);
        Integer membersApply = apply.getId();


        //计算applynum
        applyNumMapper.updateMaxNum();
        Integer applynum = applyNumMapper.queryMaxNum();

        //计算applyCode
        AutoCode autoCode = new AutoCode();
        String applyCode = autoCode.applyCode(apply, applynum, membersApply);
        apply.setApplyCode(applyCode);


        //更改applyCode添加完成
        Integer rows = applyMapper.updateApply(apply);
        return rows;
    }

    @Override
    public Integer addApplyByNoMember(Integer raceId, Information information) {
        Apply apply = new Apply();

        Race race = new Race();
        race.setId(raceId);

        informationMapper.addInformation(information);

        System.out.println(information);

        apply.setApplyCode("applyCode");
        apply.setInformation(information);
        apply.setRace(race);

        //通过主键策略,获取添加apply的id
        Integer row = applyMapper.addApply(apply);
        Integer membersApply = apply.getId();


        //计算applynum
        applyNumMapper.updateMaxNum();
        Integer applynum = applyNumMapper.queryMaxNum();

        //计算applyCode
        AutoCode autoCode = new AutoCode();
        String applyCode = autoCode.applyCode(apply, applynum, membersApply);
        apply.setApplyCode(applyCode);


        //更改applyCode添加完成
        Integer rows = applyMapper.updateApply(apply);
        return rows;
    }

    @Override
    public Apply queryApplyByRaceIdAndInformationId(Integer raceId, Integer informationId) {
        return applyMapper.queryApplyByRaceIdAndInformationId(raceId,informationId);
    }

    @Override
    public List<ApplyVo> queryApplyByRaceIdForExcel(Integer raceId) {
        return applyMapper.queryApplyByRaceIdForExcel(raceId);
    }
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
