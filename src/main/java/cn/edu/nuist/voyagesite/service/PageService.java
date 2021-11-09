package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.PageBean;
import cn.edu.nuist.voyagesite.domain.Route;


public interface PageService {
    public PageBean<Route> findByPager(Integer page, Integer size);


}
