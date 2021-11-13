package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.Route;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 我的收藏
 * @author: whl
 * @date: 2021年11月12日19点38分
 */
@Mapper
public interface FavoriteMapper {
    //根据用户id查询路线id

    List<Route> findFavoriteByUId(@Param("uid") int uid);



    //添加收藏列表
    void addFavoriteByUId(@Param("rid") int rid,@Param("date") String date,@Param("uid") int uid);

}
