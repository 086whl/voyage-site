package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.Favorite;

import java.util.List;

/**
 * @Description: 我的收藏
 * @author: whl
 * @date: 2021年11月12日19点38分
 */
public interface FavoriteService {
    //根据用户ID查询收藏列表
    public List<Favorite> findFavoriteByUId(int uid);
    //添加收藏列表
    public void addFavoriteByUid(int rid,String date,int uid);
}
