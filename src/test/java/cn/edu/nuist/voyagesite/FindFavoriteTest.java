package cn.edu.nuist.voyagesite;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.mapper.FavoriteMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FindFavoriteTest {
    @Autowired
    FavoriteMapper favoriteMapper;
    @Test
    public void findTest(){
        List<Route> favoriteByUId = favoriteMapper.findFavoriteByUId(1);
        System.out.println("favoriteByUId = " + favoriteByUId);
        favoriteMapper.removeMyroute(1,1);


    }

}
