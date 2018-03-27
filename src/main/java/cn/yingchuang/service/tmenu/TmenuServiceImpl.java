package cn.yingchuang.service.tmenu;

import cn.yingchuang.dao.tmenu.TmenuMapper;
import cn.yingchuang.entity.Tmenu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
@Service
public class TmenuServiceImpl implements TmenuService {
    @Resource
    private TmenuMapper tmenuMapper;
    @Override
    public List<Tmenu> queryListTmenu(Integer parentId) {
        return tmenuMapper.queryListTmenu(parentId);
    }

    @Override
    public Tmenu queryTmenu(Integer id) {

        return tmenuMapper.queryTmenu(id);
    }


    @Override
    public Integer addTmenu(Tmenu tmenu) {
        return tmenuMapper.addTmenu(tmenu);
    }





}
