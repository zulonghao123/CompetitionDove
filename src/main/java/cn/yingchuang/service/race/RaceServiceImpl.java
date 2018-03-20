package cn.yingchuang.service.race;

import cn.yingchuang.dao.Race.RaceMapper;
import cn.yingchuang.entity.Race;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@Service
public class RaceServiceImpl implements RaceService {
    @Resource
    private RaceMapper raceMapper;
    @Override
    public int addRace(Race race) {
        return raceMapper.addRace(race);
    }

    @Override
    public Race queryRaceById(Integer id) {
        return raceMapper.queryRaceById(id);
    }

    @Override
    public PageInfo<Race> queryAllRaceName(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Race> list = raceMapper.queryAllRaceName();
        return new PageInfo<>(list);
    }
}
