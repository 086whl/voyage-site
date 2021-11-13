package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.RouteDetail;
import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.mapper.RouteMapper;
import cn.edu.nuist.voyagesite.service.FavoriteService;
import cn.edu.nuist.voyagesite.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        RouteDetail routeDetail=routeService.findRouteDetailByRid(rid);
        model.addAttribute("routeDetail",routeDetail);
        return "/route_detail";
    }
    @Autowired
    @Qualifier("favoriteServiceImpl")
    private FavoriteService favoriteService;
    @ResponseBody
    @GetMapping("/addFavoriteCount/{rid}")
    public String addFavoriteByUId(@PathVariable int rid, HttpSession httpSession){
        //获取用户UID
        User user= (User) httpSession.getAttribute("user");
        int uid=user.getUid();
        //获取当前时间
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(d);
        //获取路线RID
        favoriteService.addFavoriteByUid(rid, date, uid);
        routeService.addFavoriteCount(rid);
        RouteDetail routeDetail=routeService.findRouteDetailByRid(rid);
        String currentCount= String.valueOf(routeDetail.getRoute().getCount());
        return currentCount;
    }
}
