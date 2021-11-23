package cn.edu.nuist.voyagesite;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.mapper.FavoriteMapper;
import cn.edu.nuist.voyagesite.service.impl.FavoriteServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FindFavoriteTest {
    @Autowired
    FavoriteServiceImpl favoriteService;
    @Autowired
    FavoriteMapper favoriteMapper;

    @Test
    public void findTest() {
        List<Route> favoriteByUId = favoriteMapper.findFavoriteByUId(1);
        System.out.println("favoriteByUId = " + favoriteByUId);
        favoriteMapper.removeMyroute(1, 1);


    }

    /**
     * 删除收藏测试
     */
    @Test
    public void removeFavTest() {

//        favoriteMapper.removeMyroute(4, 12);不能写两个SQL在一个标签内
        favoriteService.removeMyroute(4,12);

    }

}
