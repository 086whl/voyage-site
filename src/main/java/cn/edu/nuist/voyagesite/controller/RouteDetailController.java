package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.RouteDetail;
import cn.edu.nuist.voyagesite.domain.RouteImg;
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
import java.util.List;

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
    public String routeDetailParam(Model model,Integer rid,HttpSession httpSession){
        //获取用户UID
        int uid=0;
        User user= (User) httpSession.getAttribute("user");
        //判断用户是否已登录
        if (user!=null){
            uid=user.getUid();
        }
        RouteDetail routeDetail=routeService.findRouteDetailByRid(rid);
        List<RouteImg> routeImgList=routeService.findRouteImageByRid(rid);
        model.addAttribute("routeDetail",routeDetail);
        model.addAttribute("routeImgList",routeImgList);
        model.addAttribute("uid",uid);
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
        //判断用户是否已添加收藏
        if(favoriteService.isExistFavorite(rid,uid)){
            return "isExist";
        }else {
            favoriteService.addFavoriteByUid(rid, date, uid);
            routeService.addFavoriteCount(rid);
            RouteDetail routeDetail=routeService.findRouteDetailByRid(rid);
            String currentCount= String.valueOf(routeDetail.getRoute().getCount());
            return currentCount;
        }

    }
}
