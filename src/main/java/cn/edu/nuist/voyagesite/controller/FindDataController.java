package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.service.CountNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindDataController {
    @Autowired
    @Qualifier("countNumberServiceImpl")
    CountNumberService countNumber;

    @RequestMapping("countAllUser")
    public int countAllRoute() {

        return countNumber.countAllUser();
    }

    @RequestMapping("countAllFavorite")
    public int countAllFavorite() {

        return countNumber.countAllFavorite();
    }

    @RequestMapping("countAllRoute")
    public int countAllUser() {

        return countNumber.countAllRoute();
    }
}
