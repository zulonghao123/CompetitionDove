package cn.yingchuang.dao.Race;

import cn.yingchuang.entity.Race;

/**
 * Created by Max on 3-18-2018-018.
 */
public interface RaceMapper {

    //添加一条
    public int addRace(Race race);

    //查询一条
    public Race queryRaceById(Integer id);

}
