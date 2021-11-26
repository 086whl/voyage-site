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

    /**
     * 计数用户总数
     * @return 返回总数
     */
    @RequestMapping("countAllUser")
    public int countAllRoute() {

        return countNumber.countAllUser();
    }

    /**
     * 计数收藏总数
     * @return 返回总数
     */
    @RequestMapping("countAllFavorite")
    public int countAllFavorite() {

        return countNumber.countAllFavorite();
    }

    /**
     * 计数路线总数
     * @return 返回总数
     */
    @RequestMapping("countAllRoute")
    public int countAllUser() {

        return countNumber.countAllRoute();
    }

    //后端饼图数据
    @RequestMapping("pieData")
    public String pieData(){
        return null;
    }
}
