package cn.yingchuang.dao.Race;

import cn.yingchuang.entity.Race;

import java.util.List;

/**
 * Created by Max on 3-18-2018-018.
 */
public interface RaceMapper {

    //添加一条
    public int addRace(Race race);

    //查询一条
    public Race queryRaceById(Integer id);

    /**
     * 查询所有的赛事的名字信息，用来展示下拉框用的，
     * 点击赛事的时候展示所有的比赛名字，使用分页
     * 按照比赛的时间倒叙
     * @return
     */
    public List<Race> queryAllRaceName();



}
