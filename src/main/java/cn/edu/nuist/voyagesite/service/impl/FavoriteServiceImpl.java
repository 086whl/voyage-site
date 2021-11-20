package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.mapper.FavoriteMapper;
import cn.edu.nuist.voyagesite.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 我的收藏实现类
 * @author: whl
 * @date: 2021年11月12日19点38分
 */
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Autowired
    private FavoriteMapper favoriteMapper;
    //根据用户ID查询收藏列表
    @Override

    public List<Route> findFavoriteByUId(int uid) {
        List<Route> allFavorite=favoriteMapper.findFavoriteByUId(uid);
        return allFavorite;
    }
    //添加收藏列表
    @Override
    public void addFavoriteByUid(int rid,String date,int uid) {
        favoriteMapper.addFavoriteByUId(rid, date, uid);
    }
    //根据RID与UID查询记录是否存在
    @Override
    public boolean isExistFavorite(int rid, int uid) {
        Boolean isExist=favoriteMapper.isExistFavorite(rid,uid);
        return isExist;
    }

    @Override
    public void removeMyroute(int rid, int uid) {
        favoriteMapper.removeMyroute(rid,uid);
    }

    @Override
    public List<Route> favoriteRank() {
        List<Route> favoriteRankList=favoriteMapper.favoriteRank();
        return favoriteRankList;
    }

    @Override
    public List<Route> searchRoute(int uid,String word) {
        List<Route> routes = favoriteMapper.searchRoute(uid,word);
        return routes;
    }
}
