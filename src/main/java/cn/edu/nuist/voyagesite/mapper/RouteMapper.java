package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.RouteDetail;
import cn.edu.nuist.voyagesite.domain.RouteImg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 路线
 * @author: whl
 * @date: 2021年11月8日15点59分
 */
@Mapper
public interface RouteMapper {
    //获取所有路线列表
    List<Route> allRouteList();
    //根据路线rid获取路线详情
    RouteDetail findRouteDetailByRid(@Param("rid") int rid);
    //添加收藏
    void addFavoriteCount(@Param("rid") int rid);
    //获取图片详情
    List<RouteImg> findRouteImageByRid(@Param("rid") int rid);
    //获取所有路线总数
    int routeAcount();
    //获取所有页面（传入分页参数）
    List<Route> allRouteListPage(@Param("page")int page,@Param("limit")int limit);
    //根据路线rid删除路线（逻辑删除rFlag=0）
    void deleteByRid(int rid);
    //新增路线
    void addRoute(Route route);
}
