package cn.yingchuang.service;

import cn.yingchuang.entity.Race;
import cn.yingchuang.service.race.RaceService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RaceServiceImplTest {
    @Resource
    private RaceService raceService;

    /**
     * 测试增加一条赛事的信息
     * @throws Exception
     */


    /**
     * 测试通过主键id查询一条赛事信息 返回一个实体
     * @throws Exception
     */
    @Test
    public void queryRaceById() throws Exception {
        Race race = raceService.queryRaceById(1);
        System.out.println(race);
    }
    /**
     * 测试查询所有的赛事的信息，只要赛事的名字，按照比赛的时间倒序
     * @throws Exception
     */
    @Test
    public void queryAllRaceName() throws Exception {
        PageInfo<Race> pageInfo = raceService.queryAllRaceName(1, 6);
        List<Race> list = pageInfo.getList();
        if(list!=null){
            for (Race race : list) {
                System.out.println(race);

            }
        }
    }

}