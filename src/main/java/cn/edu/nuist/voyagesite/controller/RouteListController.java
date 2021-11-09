package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.PageBean;
import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.service.PageService;
import cn.edu.nuist.voyagesite.service.RouteService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 路线列表显示
 * @author: whl
 * @date: 2021年11月8日15点55分
 */
@Controller
public class RouteListController {
    @Autowired
    @Qualifier("pageServiceImpl")
    private PageService pageService;
    @RequestMapping(value="/route_list")
    public String routeListParam(Model model,Integer pageNo){
//        //获取所有路线
//        List<Route> routeList=routeService.allRouteList();
////        String rName=routeList.get(0).getRname();
////        model.addAttribute("rName", rName);
//        model.addAttribute("routeList",routeList);
        //获取所有路线
        int PageSize=10;
        //获取分页
        PageBean<Route> pageBean=pageService.findByPager(pageNo,PageSize);
        //设置当前页
        pageBean.setCurrentPage(pageNo);
        List<Route> routeList=pageBean.getList();
        model.addAttribute("routeList",routeList);
        model.addAttribute("pageBean",pageBean);
        return "route_list";
    }
}
