package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Admin;
import cn.edu.nuist.voyagesite.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@RestController
public class AdminController {
    @Autowired
    @Qualifier("adminServiceImpl")
    AdminService adminService;

    @RequestMapping("layuimini/page/findAdmin")
    public boolean findAdmin(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession httpSession, ModelAndView modelAndView) {
        Admin admin = adminService.findAdmin(username, password);
        if (admin!=null){
            httpSession.setAttribute("admin",admin);
            return true;
        }else {
            return false;
        }
    }
}
