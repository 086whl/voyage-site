package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.Route;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 搜索
 * @author: whl
 * @date: 2021年11月14日15点01分
 */
@Mapper
public interface SearchMapper {
    //模糊搜索
    List<Route> fuzzySearch(@Param("rname") String rname);
}
