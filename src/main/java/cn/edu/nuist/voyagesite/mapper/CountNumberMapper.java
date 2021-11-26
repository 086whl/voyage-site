package cn.edu.nuist.voyagesite.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CountNumberMapper {
    /**
     * 计数用户总数
     * @return 返回总数
     */
    @Select("select count(uid) from tab_user where status =1")
    int countAllUser();
    /**
     * 计数路线总数
     * @return 返回总数
     */
    @Select("select count(rid) from tab_route")
    int countAllRoute();
    /**
     * 计数收藏总数
     * @return 返回总数
     */
    @Select("select count(*) from tab_user")
    int countAllFavorite();
}
