package cn.yingchuang.service.race;

import cn.yingchuang.dao.Race.RaceMapper;
import cn.yingchuang.dao.tmenu.TmenuMapper;
import cn.yingchuang.entity.Race;
import cn.yingchuang.entity.Tmenu;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@Service
public class RaceServiceImpl implements RaceService {
    @Resource
    private RaceMapper raceMapper;
    @Resource
    private TmenuMapper tmenuMapper;


    @Override
    public int addRace(MultipartFile myFiles, String times, Race race) {
        if(myFiles.isEmpty()){
            System.out.println("文件未上传");
        }else{
            //得到上传的文件名
            String fileName = myFiles.getOriginalFilename();
            //得到服务器项目发布运行所在地址
            String path1 = "D:/media/text/";
            //此处未使用UUID来生成唯一标识,用日期作为标识
            String path = path1 + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + fileName;
            //打印文件上传路径,方便查看是否上传成功
            System.out.println(path);
            //把文件上传至path的路径
            File loadFile = new File(path);
            try {
                myFiles.transferTo(loadFile);

                race.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(times));
                race.setRaceUrl(path);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        Integer rows = raceMapper.addRace(race);
        Integer raceId = race.getId();
        Tmenu tmenu = new Tmenu();
        tmenu.setMenuName(race.getRaceName());
        tmenu.setMenuUrl(raceId.toString());
        tmenu.setParentId(3);
        tmenuMapper.addTmenu(tmenu);
        return rows;
    }
    @Override
    public Integer updateRace(MultipartFile myFiles, String times,Race race) {
        if(myFiles.isEmpty()){
            System.out.println("文件未上传");
        }else{
            //得到上传的文件名
            String fileName = myFiles.getOriginalFilename();
            //得到服务器项目发布运行所在地址
            String path1 = "D:/media/text/";
            //此处未使用UUID来生成唯一标识,用日期作为标识
            String path = path1 + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + fileName;
            //打印文件上传路径,方便查看是否上传成功
            System.out.println(path);
            //把文件上传至path的路径
            File loadFile = new File(path);
            try {
                myFiles.transferTo(loadFile);

                race.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(times));
                race.setRaceUrl(path);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return raceMapper.updateRace(race);
    }

    @Override
    public Integer deleteRace(Integer id) {
        return raceMapper.deleteRace(id);
    }

    @Override
    public List<Race> queryAllRace() {
        return raceMapper.queryAllRace();
    }

    @Override
    public Race queryRaceById(Integer id) {
        return raceMapper.queryRaceById(id);
    }

    @Override
    public PageInfo<Race> queryAllRaceName(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Race> list = raceMapper.queryAllRaceName();
        return new PageInfo<Race>(list);
    }
    @Override
    public String queryUrlById(Integer id) {
        return raceMapper.queryUrlById(id);
    }



}
