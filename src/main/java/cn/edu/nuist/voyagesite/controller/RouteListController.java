package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.RutePackage;
import cn.edu.nuist.voyagesite.domain.PageBean;
import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.service.PageService;
import cn.edu.nuist.voyagesite.service.RouteService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String routeListParam(Model model,Integer cId,Integer pageNo){
        //获取所有路线
        int PageSize=10;
        //获取分页
        PageBean<Route> pageBean=pageService.routeListByCidPage(cId,pageNo,PageSize);
        //设置当前页
        pageBean.setCurrentPage(pageNo);
        List<Route> routeList=pageBean.getList();
        model.addAttribute("routeList",routeList);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("cId",cId);
        return "route_list";
    }
    @Autowired
    @Qualifier("routeServiceImpl")
    private RouteService routeService;
    @ResponseBody
    @RequestMapping(value = "/all_route_list")
    public String allRouteList(@RequestParam("page") int page,@RequestParam("limit") int limit){
        //分页
        List<Route> allRouteList=routeService.allRouteListPage(((page-1)*limit),limit);
        int count=routeService.routeCount();
        //封装
        RutePackage rutePackage = new RutePackage();
        rutePackage.setCode(0);
        rutePackage.setMsg("success");
        rutePackage.setData(allRouteList);
        rutePackage.setCount(count);
        //转为json
        String allRouteList_J =JSON.toJSONString(rutePackage);
        return allRouteList_J;
    }
}
