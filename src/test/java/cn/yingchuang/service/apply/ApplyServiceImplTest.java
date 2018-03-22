package cn.yingchuang.service.apply;

import cn.yingchuang.entity.Apply;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ApplyServiceImplTest {
    @Resource
    private ApplyService applyService;
    @Test
    public void queryApplyByIdNumber() throws Exception {
        Apply apply = applyService.queryApplyByIdNumber("124213412521312124");
        if(apply!=null){
            System.out.println(apply);
        }
    }

    @Test
    public void queryAllApply() throws Exception {
        PageInfo<Apply> pageInfo = applyService.queryAllApply(1, 8);
        List<Apply> list = pageInfo.getList();
        if(list!=null){
            for (Apply apply : list) {
                System.out.println(apply);
            }
        }
    }

    @Test
    public void queryApplyByRaceId() throws Exception {
        PageInfo<Apply> pageInfo = applyService.queryApplyByRaceId(1, 1, 8);
        List<Apply> list = pageInfo.getList();
        if(list!=null){
            for (Apply apply : list) {
                System.out.println(apply);
            }
        }
    }

}