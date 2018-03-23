package cn.yingchuang.controller.media;

import cn.yingchuang.command.util.Message;
import cn.yingchuang.entity.Media;
import cn.yingchuang.service.media.MediaService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 祖龙浩 on 2018/3/20.
 */
@Controller
@RequestMapping("media")
public class MediaController {
    @Resource
    private MediaService mediaService;


    @RequestMapping("toMedia")
    public String toMedia(){
        return "fileUpLoad";
    }

    /**
     * media批量传图片
     * @param myFiles
     * @param media
     * @return
     */
    @RequestMapping(value = "addMediaImage",method = RequestMethod.POST)
    public String addMediaImage(@RequestParam MultipartFile[] myFiles, Media media, Model model) {


        Integer rows = mediaService.addMediaImage(myFiles, media);
        if(rows > 0){
            model.addAttribute("message", "图片上传成功");
        }else{
            model.addAttribute("message", "图片上传失败");
        }

        return "fileUpLoad";
    }

    /**
     * media批量视频
     * @param myFiles
     * @param media
     * @return
     */
    @RequestMapping(value = "addMediaVideos",method = RequestMethod.POST)
    public String addMediaVideos(@RequestParam MultipartFile[] myFiles, Media media, Model model) {


        Integer rows = mediaService.addMediaVideos(myFiles, media);
        if(rows > 0){
            model.addAttribute("message", "视频上传成功");
        }else{
            model.addAttribute("message", "视频上传失败");
        }

        return "fileUpLoad";
    }

    @RequestMapping("toUpdateMedia")
    public String toUpdateMedia(Model model){
        List<Media> list=new ArrayList<>();
        list=mediaService.queryAllVideo();
        model.addAttribute("video",list);
        return "updateMedia";
    }

    @ResponseBody
    @RequestMapping(value = "updateVideo",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public String updateVideo(int id){
        int a=mediaService.updateVideo(id);
        if(a>0){
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
}
