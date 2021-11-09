package cn.edu.nuist.voyagesite;

import cn.edu.nuist.voyagesite.domain.Category;
import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.RouteDetail;
import cn.edu.nuist.voyagesite.mapper.CategoryMapper;
import cn.edu.nuist.voyagesite.mapper.RouteMapper;
import cn.edu.nuist.voyagesite.service.impl.RouteServiceImpl;
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
}
