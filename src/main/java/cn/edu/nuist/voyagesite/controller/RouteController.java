package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 路线列表后台管理
 * @author: whl
 * @date: 2021年11月16日15点28分
 */
@RestController
@RequestMapping("/routeManage")
public class RouteController {
    @Autowired
    @Qualifier("routeServiceImpl")
    private RouteService routeService;

    @RequestMapping("/routeDelete")
    public String routeDelete(int rid){
        routeService.deleteByRid(rid);
        return null;
    }
    @RequestMapping("/routeAdd")
    public String routeAdd(){
        return null;
    }

}