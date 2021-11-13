package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MyFavoriteController {
    @Autowired
    @Qualifier("favoriteServiceImpl")
    FavoriteService favoriteService;

    @RequestMapping("/findMyFavouriteRoute")
    public String findFavoriteRoute(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        List<Route> favoriteByUId = favoriteService.findFavoriteByUId(user.getUid());
        model.addAttribute("favouriteRoutes",favoriteByUId);

        return "myfavorite";
    }

}
