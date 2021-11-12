package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.RouteDetail;
import cn.edu.nuist.voyagesite.mapper.RouteMapper;
import cn.edu.nuist.voyagesite.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 路线服务实现类
 * @author: whl
 * @date: 2021年11月8日17点25分
 */
@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteMapper routeMapper;
    @Override
    public List<Route> allRouteList() {
        List<Route> route=routeMapper.allRouteList();
        return route;
    }

    @Override
    public RouteDetail findRouteDetailByRid(int rid) {
        RouteDetail routeDetail=routeMapper.findRouteDetailByRid(rid);
        return routeDetail;
    }

    @Override
    public void addFavoriteCount(int rid) {
        routeMapper.addFavoriteCount(rid);
    }
}
