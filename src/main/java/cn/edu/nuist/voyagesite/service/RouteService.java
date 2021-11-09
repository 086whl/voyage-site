package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.RouteDetail;

import java.util.List;

/**
 * @Description: 路线服务类
 * @author: whl
 * @date: 2021年11月8日17点25分
 */

public interface RouteService {
    List<Route> allRouteList();
    RouteDetail findRouteDetailByRid(int rid);
}
