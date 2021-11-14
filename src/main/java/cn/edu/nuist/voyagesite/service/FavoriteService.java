package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.Route;

import java.util.List;

/**
 * @Description: 我的收藏
 * @author: whl
 * @date: 2021年11月12日19点38分
 */
public interface FavoriteService {
    //根据用户ID查询收藏列表
    public List<Route> findFavoriteByUId(int uid);
    //添加收藏列表
    public void addFavoriteByUid(int rid,String date,int uid);
    //根据RID与UID查询记录是否存在
    public boolean isExistFavorite(int rid,int uid);
}
