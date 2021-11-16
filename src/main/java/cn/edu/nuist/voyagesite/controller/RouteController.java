package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.RutePackage;
import cn.edu.nuist.voyagesite.service.RouteService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public String routeAdd(@RequestParam("addJson") String addJson){
        JSONObject userJson = JSONObject.parseObject(addJson);
        Route routeAdd=JSON.toJavaObject(userJson,Route.class);
        routeService.addRoute(routeAdd);
        return null;
    }
    @RequestMapping("/routeEdit")
    public String routeEdit(@RequestParam("editJson") String editJson){
        JSONObject userJson = JSONObject.parseObject(editJson);
        Route routeEdit=JSON.toJavaObject(userJson,Route.class);
        routeService.editRoute(routeEdit);
        return null;
    }
    @RequestMapping("/searchByRid")
    public String searchByRid(@RequestParam("page") int page,@RequestParam("limit") int limit,@RequestParam("rid") int rid){
        //分页
        List<Route> searchByRid=routeService.searchByRid(((page-1)*limit),limit,rid);
        int count=routeService.searchByRidCount(rid);
        //封装
        RutePackage rutePackage = new RutePackage();
        rutePackage.setCode(0);
        rutePackage.setMsg("success");
        rutePackage.setData(searchByRid);
        rutePackage.setCount(count);
        //转为json
        String allRouteList_J =JSON.toJSONString(rutePackage);

        return allRouteList_J;
    }
    @RequestMapping("/searchByRname")
    public String searchByRname(@RequestParam("page") int page,@RequestParam("limit") int limit,@RequestParam("rname") String rname){
        //分页
        List<Route> searchByRname=routeService.searchByRname(((page-1)*limit),limit,rname);
        int count=routeService.searchByRnameCount(rname);
        //封装
        RutePackage rutePackage = new RutePackage();
        rutePackage.setCode(0);
        rutePackage.setMsg("success");
        rutePackage.setData(searchByRname);
        rutePackage.setCount(count);
        //转为json
        String allRouteList_J =JSON.toJSONString(rutePackage);
        return allRouteList_J;
    }

}
