package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.PageBean;
import cn.edu.nuist.voyagesite.domain.Route;
/**
 * @Description: 分页
 * @author: whl
 * @date: 2021年11月10日23点04分
 */

public interface PageService {

    public PageBean<Route> findByPager(Integer page, Integer size);
    /**
     *
     * @param cId 分类id
     * @param page 当前页
     * @param size 页面大小
     * @return
     */
    public PageBean<Route> routeListByCidPage(Integer cId,Integer page, Integer size);

}
