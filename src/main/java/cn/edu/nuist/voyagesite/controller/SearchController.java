package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Route;
import cn.edu.nuist.voyagesite.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description: 搜索功能
 * @author: whl
 * @date: 2021年11月14日15点30分
 */
@Controller
public class SearchController {
    @Autowired
    @Qualifier("searchServiceImpl")
    private SearchService searchService;
    @RequestMapping("mysearchresult")
    public String fuzzySearch(Model model,String rname){
        List<Route> fuzzySearchResult=searchService.fuzzySearch(rname);
        model.addAttribute("fuzzySearchResult",fuzzySearchResult);
        return "mysearchresult";
    }
}
