package cn.edu.nuist.voyagesite.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CountNumberMapper {
    @Select("select count(uid) from tab_user")
    int countAllUser();
    @Select("select count(rid) from tab_route")
    int countAllRoute();
    @Select("select count(*) from tab_user")
    int countAllFavorite();
}
