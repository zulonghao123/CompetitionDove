package cn.yingchuang.controller.news;
import cn.yingchuang.command.util.Message;
import cn.yingchuang.entity.News;
import cn.yingchuang.service.News.NewsService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/20.
 */
@Controller
@RequestMapping("news")
public class NewsController {
    @Resource
    private NewsService newsService;


    @ResponseBody
    @RequestMapping(value = "addNews", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String addNews(News news) {


        String str = news.getNewsContent();

        String jieguo = str.substring(str.indexOf("image")+6,str.indexOf("image")+14);
        String str1 = str.replaceAll("/ueditor/jsp/upload/image/"+jieguo,"/fileImages");
        System.out.println(str1);
        news.setNewsContent(str1);
        int rows = newsService.addNews(news);
        io();
        if (rows > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }

    @ResponseBody
    @RequestMapping(value = "queryNewsByTmenuId", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public String queryNews(Integer tmenuId, Model model) {
        News news = newsService.queryNewsByTmenuId(tmenuId);
        return JSON.toJSONString(news);
    }

    @ResponseBody
    @RequestMapping(value = "updateNews", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String updateNews(News news) {

        String str = news.getNewsContent();

        String jieguo = str.substring(str.indexOf("image")+6,str.indexOf("image")+14);
        String str1 = str.replaceAll("/ueditor/jsp/upload/image/"+jieguo,"/fileImages");
        System.out.println(str1);
        news.setNewsContent(str1);

        int rows = newsService.updateNews(news);
        io();
        if (rows > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }


    @RequestMapping("doNewsDetail")
    public String doNewsDetail(Integer newId, Model model) {
        News news = newsService.queryNewsById(newId);
        System.out.println(news);
        model.addAttribute("news", news);
        return "newsDetail";
    }

    public void io() {
        // 获得指定路径下的所有文件，复制到指定路径下
        // 思路
		/*
		 * 封装原始文件夹
		 *
		 * @封装目标文件夹
		 *
		 * @判断是否有文件夹，没有就创建目标文件夹 @ 获取file文件数组
		 *
		 * @遍历数组
		 *
		 * @获取file的名字 ===获取名字+路径的file 调用复制方法
		 */
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String dateStr = simpleDateFormat.format(date);
        System.out.println(dateStr);
        File srcFolder = new File("E:\\tcmp064workspace\\CompetitionDove\\classes\\artifacts\\CompetitionDove_Web_exploded\\ueditor\\jsp\\upload\\image\\"+dateStr);
        File destFolder = new File("D:\\media\\images");
        // 判断是否有文件夹，没有就创建目标文件夹
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        // 获取file文件数组
        File[] fileArray = srcFolder.listFiles();
        // 遍历集合
        for (File f : fileArray) {
            // System.out.println(f);
            String name = f.getName();
            // 组成一个新文件成员,存目标文件用
            File newFile = new File(destFolder, name);
            // 将file成员复制到目标文件区
            try {
                copyFolder(f, newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void copyFolder(File f, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(f));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(newFile));
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();

    }
}
