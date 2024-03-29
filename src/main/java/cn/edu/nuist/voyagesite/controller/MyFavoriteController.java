package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MyFavoriteController {
    @Autowired
    @Qualifier("favoriteServiceImpl")
    FavoriteService favoriteService;

    //找到收藏的route
    @RequestMapping("/findMyFavouriteRoute")
    public String findFavoriteRoute(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        List<Route> favoriteByUId = favoriteService.findFavoriteByUId(user.getUid());
        model.addAttribute("favouriteRoutes", favoriteByUId);
        return "myfavorite";
    }

    //判断用户是否已收藏
    @ResponseBody
    @RequestMapping("/isExistFavorite")
    public Boolean isExistFavorite(Integer rid, Integer uid) {
        boolean flag = favoriteService.isExistFavorite(rid, uid);
        if (flag) {
            return true;
        }
        return false;
    }

    //    删除收藏的路线
    @RequestMapping("/removeMyroute")
    public String removeMyroute(@RequestParam("rid") Integer rid, HttpSession session) {
        User user = (User) session.getAttribute("user");
        favoriteService.removeMyroute(rid, user.getUid());
        return "redirect:findMyFavouriteRoute";
    }

    //收藏页面搜索结果
    @RequestMapping("/searchRoute")
    public String searchRoute(@RequestParam("uid") int uid,@RequestParam("word") String word, Model model) {
        System.out.println( uid+word);
        List<Route> routes = favoriteService.searchRoute(uid,word);
        model.addAttribute("favouriteRoutes", routes);
        return "myfavorite";
    }

}
