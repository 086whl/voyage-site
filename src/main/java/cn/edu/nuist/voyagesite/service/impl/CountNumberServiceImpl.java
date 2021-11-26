package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.mapper.CountNumberMapper;
import cn.edu.nuist.voyagesite.service.CountNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountNumberServiceImpl implements CountNumberService {
    @Autowired
    CountNumberMapper countNumberMapper;

    /**
     * 计数用户总数
     *
     * @return 返回总数
     */
    @Override
    public int countAllUser() {
        return countNumberMapper.countAllUser();
    }

    /**
     * 计数路线总数
     *
     * @return 返回总数
     */
    @Override
    public int countAllRoute() {
        return countNumberMapper.countAllRoute();
    }

    /**
     * 计数收藏总数
     *
     * @return 返回总数
     */
    @Override
    public int countAllFavorite() {
        return countNumberMapper.countAllFavorite();
    }
}
