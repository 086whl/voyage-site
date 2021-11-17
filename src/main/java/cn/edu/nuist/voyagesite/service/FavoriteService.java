package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.Route;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 我的收藏
 * @author: whl
 * @date: 2021年11月12日19点38分
 */
@Service
public interface FavoriteService {
    //根据用户ID查询收藏列表
    List<Route> findFavoriteByUId(int uid);
    //添加收藏列表
    void addFavoriteByUid(int rid,String date,int uid);
    //根据RID与UID查询记录是否存在
    boolean isExistFavorite(int rid,int uid);

    void removeMyroute(int rid, int uid);

    //收藏排行榜
    List<Route> favoriteRank();
}
