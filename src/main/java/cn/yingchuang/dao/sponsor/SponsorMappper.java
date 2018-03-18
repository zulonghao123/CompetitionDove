package cn.yingchuang.dao.sponsor;

import cn.yingchuang.entity.Sponsor;

/**
 * Created by Administrator on 2018/3/18.
 */
public interface SponsorMappper {
//    关联媒体表
//      同时查询sponsor的信息和媒体表的url
    public Sponsor queryAllSponsor();
}
