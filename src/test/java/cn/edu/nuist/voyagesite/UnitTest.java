package cn.edu.nuist.voyagesite;

import cn.edu.nuist.voyagesite.domain.Category;
import cn.edu.nuist.voyagesite.domain.PageBean;
import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.RouteDetail;
import cn.edu.nuist.voyagesite.mapper.CategoryMapper;
import cn.edu.nuist.voyagesite.mapper.RouteMapper;
import cn.edu.nuist.voyagesite.service.PageService;
import cn.edu.nuist.voyagesite.service.impl.FavoriteServiceImpl;
import cn.edu.nuist.voyagesite.service.impl.PageServiceImpl;
import cn.edu.nuist.voyagesite.service.impl.RouteServiceImpl;
import cn.edu.nuist.voyagesite.service.impl.SearchServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UnitTest {
    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    public void findAll(){
        List<Category> category=categoryMapper.findAll();
        System.out.println(category.get(0).getCname());
    }

    @Autowired
    private RouteMapper routeMapper;
    @Test
    public void findAllRoute(){
        List<Route> routes=routeMapper.allRouteList();
        System.out.println(routes.get(0).getRname()+"/t"+routes.get(1).getRname());
    }
    @Test
    public void findRouteDetailByRidTest(){
        RouteDetail routeDetail = routeMapper.findRouteDetailByRid(1);
        System.out.println(routeDetail.getRoute().getRname());
    }
    @Autowired
    private PageServiceImpl pageServiceImpl;
    @Test
    public void PageTest(){
        PageBean pageBean=pageServiceImpl.findByPager(1,3);
        System.out.println(pageBean.getList().toString());
    }
    @Autowired
    private FavoriteServiceImpl favoriteService;
    @Test
    public void isExist(){
        System.out.println(favoriteService.isExistFavorite(4,10));
    }

    @Autowired
    private SearchServiceImpl searchService;
    @Test
    public void fuzzySearchTest(){
        List<Route> resultList=searchService.fuzzySearch("官网");
        System.out.println(resultList.get(0));
    }
    @Test
    public void routePageTest(){
        List<Route> routeList = routeMapper.allRouteListPage(0, 10);
        System.out.println(routeList);
    }
    @Test
    public  void routeDelete(){
        routeMapper.deleteByRid(1);
    }
}
