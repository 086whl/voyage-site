package cn.edu.nuist.voyagesite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    @RequestMapping("/finAdmin")
    public  void findAdmin(@RequestParam("username") String username,@RequestParam("password")String password){

    }
}
