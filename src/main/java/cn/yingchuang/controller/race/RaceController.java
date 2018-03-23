package cn.yingchuang.controller.race;

import cn.yingchuang.entity.News;
import cn.yingchuang.entity.Race;
import cn.yingchuang.service.News.NewsService;
import cn.yingchuang.service.race.RaceService;
import cn.yingchuang.service.tmenu.TmenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * Created by 祖龙浩 on 2018/3/20.
 */
@Controller
@RequestMapping("race")
public class RaceController {
    @Resource
    private RaceService raceService;
    @Resource
    private TmenuService tmenuService;
    @Resource
    private NewsService newsService;

    @RequestMapping("toRace")
    public String toRace(){
        return "addRace";
    }


//通过二级目录，查到新闻，吧新闻传递到新闻页去
@RequestMapping("doRaceDetail")
public String doRaceDetail(Integer raceId,Model model){
    List<News> newsindex= newsService.queryNews(raceId);
    News news = newsindex.get(0);
    model.addAttribute("news", news);
    model.addAttribute("raceId", tmenuService.queryTmenu(raceId).getMenuUrl());
    return "raceDetail";
}

    /**
     * 后台添加race方法
     * @param myFiles
     * @return
     */
    @RequestMapping(value = "addRace",method = RequestMethod.POST)
    public String addRace(@RequestParam MultipartFile myFiles, String times, Race race, Model model) {

        Integer rows = raceService.addRace(myFiles, times, race);
        if(rows > 0){
            model.addAttribute("message", "添加成功");
        }else{
            model.addAttribute("message", "添加失败");
        }

        return "addRace";
    }

    /**
     * 后台修改race方法
     * @param myFiles
     * @return
     */
    @RequestMapping(value = "updateRace",method = RequestMethod.POST)
    public String updateRace(@RequestParam MultipartFile myFiles, String times, Race race) {

        Integer rows = raceService.updateRace(myFiles, times, race);
        System.out.println(rows);

        return null;
    }
    @RequestMapping(value = "deleteRace",method = RequestMethod.POST)
    public String deleteRace(Integer id) {
        return null;
    }

    /**
     * 前台下载赛事规则文档的方法
     * @param id 需求race的id
     * @param response
     */
    @RequestMapping(value = "downLoadRaceFile",method = RequestMethod.GET)
    public void downLoadRaceFile(Integer id, HttpServletResponse response){
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");


        String url = raceService.queryUrlById(id);
        System.out.println(url);
        Integer i = url.lastIndexOf("/");
        String fileName1 = url.substring(i + 1);
        System.out.println(fileName1);
        String fileName = null;
        try {
            fileName = new String(fileName1.getBytes(), "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        response.setHeader("Content-Disposition","attachment;fileName="+fileName);
        System.out.println(fileName);
        File file = new File(url);
        InputStream in = null;
        OutputStream out = null;

        try {

            in = new BufferedInputStream(new FileInputStream(file));
            out = response.getOutputStream();
            byte[] b = new byte[2048];
            int length = -1;
            while ((length = in.read(b))!=-1){
                out.write(b,0,length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
