package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.Route;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description: 路线
 * @author: whl
 * @date: 2021年11月8日15点59分
 */
@Mapper
public interface RouteMapper {
    List<Route> allRoute();
}
