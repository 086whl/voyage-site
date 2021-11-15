package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.Route;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Description: 分页
 * @author: whl
 * @date: 2021年11月6日23点12分
 */
@Mapper
public interface PageMapper {
    //对所有路线列表进行分页
    List<Route> findByPage(Map<String, Object> params);
    //所有路线总数
    long count();
    //路线分类后的列表进行分页
    List<Route> routeListByCidPage(Map<String,Object> params);
    //按路线分类统计总数
    long contByCid(int cId);
}
