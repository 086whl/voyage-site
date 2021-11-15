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

    //    删除收藏的路线
    @RequestMapping("/removeMyroute")
    public String removeMyroute(@RequestParam("rid") Integer rid,HttpSession session ) {
         User user = (User) session.getAttribute("user");
        favoriteService.removeMyroute(rid, user.getUid());
        return "redirect:findMyFavouriteRoute";
    }


}
