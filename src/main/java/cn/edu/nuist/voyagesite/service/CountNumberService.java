package cn.edu.nuist.voyagesite.service;

import org.springframework.stereotype.Service;

@Service
public interface CountNumberService {
    /**
     * 计数用户总数
     * @return 返回总数
     */
    int countAllUser();
    /**
     * 计数路线总数
     * @return 返回总数
     */
    int countAllRoute();
    /**
     * 计数收藏总数
     * @return 返回总数
     */
    int countAllFavorite();
}
