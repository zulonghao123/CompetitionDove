package cn.yingchuang.service.media;

import cn.yingchuang.entity.Media;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by 祖龙浩 on 2018/3/20.
 */
public interface MediaService {
    //查询所有媒体
    public List<Media> queryAllMedia();
    //按id查询一条媒体信息
    public Media queryMediaById(Integer id);
    //添加媒体信息
    public Integer addMediaImage(MultipartFile[] myFiles,Media media);
    public Integer addMediaVideos(MultipartFile[] myFiles,Media media);
}
