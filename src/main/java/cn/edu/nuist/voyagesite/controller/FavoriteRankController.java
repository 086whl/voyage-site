package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description: 收藏排行榜
 * @author: whl
 * @date: 2021年11月16日15点28分
 */
@Controller
public class FavoriteRankController {
    @Autowired
    @Qualifier("favoriteServiceImpl")
    private FavoriteService favoriteService;
    @RequestMapping("/favoriterank")
    public String favoriteRank(Model model){
        List<Route> favoriteRankList= favoriteService.favoriteRank();
        model.addAttribute("favoriteRankList",favoriteRankList);
        return "favoriterank";
    }
}
