package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.RouteDetail;
import cn.edu.nuist.voyagesite.domain.RouteImg;

import java.util.List;

/**
 * @Description: 路线服务类
 * @author: whl
 * @date: 2021年11月8日17点25分
 */

public interface RouteService {
    //获取所有路线列表
    List<Route> allRouteList();
    //根据路线RID获取路线详情
    RouteDetail findRouteDetailByRid(int rid);
    //添加收藏
    void addFavoriteCount(int rid);
    //获取图片详情
    List<RouteImg> findRouteImageByRid(int rid);
    //获取所有路线总数
    int routeCount();
    //获取所有页面（传入分页参数）
    List<Route> allRouteListPage(int page,int limit);
    //根据路线rid删除路线（逻辑删除rFlag=0）
    void deleteByRid(int rid);
    //新增路线
    void addRoute(Route route);
    //编辑路线
    void editRoute(Route route);
    //通过rid查找路线,模糊查找（传入分页参数）
    List<Route> searchByRid(int page,int limit,int rid);
    //通过rid模糊查找后的记录总数
    int searchByRidCount(int rid);
    //通过路线名查找路线,模糊查找（传入分页参数）
    List<Route> searchByRname(int page,int limit,String rname);
    //通过路线名模糊查找后的记录总数
    int searchByRnameCount(String rname);
}
