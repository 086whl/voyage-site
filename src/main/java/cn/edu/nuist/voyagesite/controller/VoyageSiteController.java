package cn.edu.nuist.voyagesite.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VoyageSiteController {

    /**
     * 查询用户
     * @return
     */
    @RequestMapping("/findUser")
    public String findUser(){
        return null;
    }



    /**查询类别
     *
     * @return
     */
    @RequestMapping("/category")
    public String category(){
        return null;
    }

    /**
     * 验证码
     * @return
     */
    @RequestMapping("/checkCode")
    public String checkCode(){
        return null;
    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping("/exit")
    public String exit(){
        return null;
    }


    /**
     * 查询路线
     * @return
     */
    @RequestMapping("/route")
    public String route(){
        return null;
    }

    /**
     *
     * @return
     */
    @RequestMapping("/user")
    public String user(){
        return null;
    }

}
