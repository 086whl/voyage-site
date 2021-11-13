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

        return favoriteMapper.findFavoriteByUId(uid);
    }
    //添加收藏列表
    @Override
    public void addFavoriteByUid(int rid,String date,int uid) {
        favoriteMapper.addFavoriteByUId(rid, date, uid);
    }
}
