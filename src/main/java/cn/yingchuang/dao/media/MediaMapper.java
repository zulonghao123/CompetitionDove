package cn.yingchuang.dao.media;

import cn.yingchuang.entity.Media;

import java.util.List;

/**
 * Created by Administrator on 2018/3/18.
 */
public interface MediaMapper {
    //查询所有媒体
    public List<Media>queryAllMedia();
    //按id查询一条媒体信息
    public Media queryMediaById(Integer id);
    //添加媒体信息
    public Integer addMedia(Media media);

    //查询所有视频
    public List queryAllVideo();
    //修改主页显示视频
    public int updateVideo(int id);


    public Media queryMediaByMediaMessage(String mediaMessage);

}
