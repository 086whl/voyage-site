package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Route;
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
    @Qualifier("routeServiceImpl")
    private RouteService routeService;
    @RequestMapping("/route_list.html")
    public String routeListParam(Model model){
        List<Route> routeList=routeService.allRouteList();

        String rName=routeList.get(0).getRname();
        model.addAttribute("rName", rName);
        model.addAttribute("routeList",routeList);
        return "route_list";
    }
}
