package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.DataSetPackage;
import cn.edu.nuist.voyagesite.domain.PieDataPackage;
import cn.edu.nuist.voyagesite.service.ChartsService;
import cn.edu.nuist.voyagesite.service.CountNumberService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @Autowired
    @Qualifier("chartsServiceImpl")
    private ChartsService chartsService;
    //后台饼图数据
    @RequestMapping("pieData")
    public String pieData(){
        List<PieDataPackage> pieDataPackages = chartsService.pieData();
        String s = JSON.toJSONString(pieDataPackages);
        return s;
    }
    //后台柱状图数据
    @RequestMapping("dataSetData")
    public String dataSetData(){
        List<DataSetPackage> c = chartsService.dataSetData();
        String s = JSON.toJSONString(c);
        return s;
    }
}
