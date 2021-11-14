package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.mapper.SearchMapper;
import cn.edu.nuist.voyagesite.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Description: 搜索服务实现类
 * @author: whl
 * @date: 2021年11月14日14点59分
 */
@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SearchMapper searchMapper;

    @Override
    public List<Route> fuzzySearch(String rname) {
        List<Route> searchResultList=searchMapper.fuzzySearch(rname);
        return searchResultList;
    }
}
