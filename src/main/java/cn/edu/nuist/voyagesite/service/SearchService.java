package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.Route;

import java.util.List;

/**
 * @Description: 搜索服务类
 * @author: whl
 * @date: 2021年11月14日14点59分
 */
public interface SearchService {
    //前台主页模糊搜索
    List<Route> fuzzySearch(String rname);
}
