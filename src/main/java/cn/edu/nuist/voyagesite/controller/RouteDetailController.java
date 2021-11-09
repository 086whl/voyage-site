package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.mapper.RouteMapper;
import cn.edu.nuist.voyagesite.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 路线详情显示
 * @author: whl
 * @date: 2021年11月9日14点26分
 */
@Controller
public class RouteDetailController {
    @Autowired
    @Qualifier("routeServiceImpl")
    private RouteService routeService;
    @RequestMapping("/route_detail")
    public String routeDetailParam(Model model,Integer rid){
        Route routeDetail=routeService.findRouteDetailByRid(rid);
        model.addAttribute("routeDetail",routeDetail);
        return "route_detail";
    }
}
