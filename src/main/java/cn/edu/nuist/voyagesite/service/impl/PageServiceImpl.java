package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.PageBean;
import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.mapper.PageMapper;
import cn.edu.nuist.voyagesite.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Description: 路线分页服务实现类
 * @author: whl
 * @date: 2021年11月9日20点39分
 */
@Service
public class PageServiceImpl implements PageService {
    @Autowired
    private PageMapper pageMapper;
    @Override
    public PageBean<Route> findByPager(Integer page, Integer size){
        //分页Mapper入参，传递起始页与页面大小
        Map<String, Object> params=new HashMap<String, Object>();
        params.put("page",(page-1)*size);
        params.put("size",size);
        //获取分页后路线集合
        List<Route> list=pageMapper.findByPage(params);
        //封装
        PageBean<Route> pageBean=new PageBean<Route>();
        pageBean.setList(list);
        pageBean.setTotalCount(pageMapper.count());
        pageBean.setTotalPage((pageBean.getTotalCount()/10)+1);
        return pageBean;
    }
}
