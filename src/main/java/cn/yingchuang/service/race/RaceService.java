package cn.yingchuang.service.race;

import cn.yingchuang.entity.Race;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
public interface RaceService {
    //添加一条
    public int addRace(MultipartFile myFiles, String times, Race race);

    //查询一条
    public Race queryRaceById(Integer id);

    /**
     * 查询所有的赛事的名字信息，用来展示下拉框用的，
     * 点击赛事的时候展示所有的比赛名字，使用分页
     * 按照比赛的时间倒叙  使用bootstrap进行分页
     * @return
     */
    public PageInfo<Race> queryAllRaceName(Integer pageNum, Integer pageSize);

    /**
     * 按id赛事文档地址
     * @param id 赛事表的id
     * @return  赛事文档的url地址
     */
    String queryUrlById(Integer id);

    /**
     * 修改赛事信息
     * @param race
     * @return
     */
    Integer updateRace(MultipartFile myFiles, String times,Race race);

    /**
     * 删除赛事信息
     * @param id
     * @return
     */
    Integer deleteRace(@Param("id") Integer id);

    /**
     * 查全部生成excel测试
     * @return
     */
    List<Race> queryAllRace();
}
