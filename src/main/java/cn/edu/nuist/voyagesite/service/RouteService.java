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
}
