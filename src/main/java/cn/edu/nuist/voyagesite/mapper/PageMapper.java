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
    List<Route> findByPage(Map<String, Object> params);
    long count();
}
