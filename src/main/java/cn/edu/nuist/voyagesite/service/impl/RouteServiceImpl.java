package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.RouteDetail;
import cn.edu.nuist.voyagesite.domain.RouteImg;
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
    @Qualifier("routeMapper")
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

    @Override
    public List<RouteImg> findRouteImageByRid(int rid) {
        List<RouteImg> routeImgList=routeMapper.findRouteImageByRid(rid);
        return routeImgList;
    }

    @Override
    public int routeCount() {
        int routeCount=routeMapper.routeCount();
        return routeCount;
    }

    @Override
    public List<Route> allRouteListPage(int page, int limit) {
        List<Route> allRouteListPage=routeMapper.allRouteListPage(page,limit);
        return allRouteListPage;
    }

    @Override
    public void deleteByRid(int rid) {
        routeMapper.deleteByRid(rid);
    }

    @Override
    public void addRoute(Route route) {
        routeMapper.addRoute(route);
    }

    @Override
    public void editRoute(Route route) {
        routeMapper.editRoute(route);
    }

    @Override
    public List<Route> searchByRid(int page, int limit, int rid) {
        List<Route> findByRidList=routeMapper.searchByRid(page, limit, rid);
        return findByRidList;
    }

    @Override
    public int searchByRidCount(int rid) {
        int searchByRidCount=routeMapper.searchByRidCount(rid);
        return searchByRidCount;
    }

    @Override
    public List<Route> searchByRname(int page, int limit, String rname) {
        List<Route> searchByRname=routeMapper.searchByRname(page, limit, rname);
        return searchByRname;
    }

    @Override
    public int searchByRnameCount(String rname) {
        int searchByRnameCount=routeMapper.searchByRnameCount(rname);
        return searchByRnameCount;
    }
}
