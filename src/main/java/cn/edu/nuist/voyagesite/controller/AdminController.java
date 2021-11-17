package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.Admin;
import cn.edu.nuist.voyagesite.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 后台登录控制器
 */
@RestController
public class AdminController {
    @Autowired
    @Qualifier("adminServiceImpl")
    AdminService adminService;

    /**
     * 管理员登录
     * @param username 传入用户名
     * @param password 传入密码
     * @param httpSession session保存登录的管理员信息
     * @return 返回true登录成功，否则失败
     */
    @RequestMapping("/layuimini/page/findAdmin")
    public boolean findAdmin(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession httpSession) {
        Admin admin = adminService.findAdmin(username, password);
        if (admin != null) {
            httpSession.setAttribute("admin", admin);
            return true;
        } else {
            return false;
        }
    }

    /**
     * 修改密码
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @param httpSession session 与登录用户密码比对
     * @return 返回true修改成功。否则失败
     */
    @RequestMapping("updateAdminPassword")
    public boolean updatePassword(@RequestParam("old_password") String oldPassword, @RequestParam("new_password") String newPassword, HttpSession httpSession) {
        Admin admin = (Admin) httpSession.getAttribute("admin");
        if (oldPassword.equals(admin.getPassword())) {
            adminService.updatePassword(admin.getAdmin(), newPassword);
            httpSession.removeAttribute("admin");
            return true;
        } else {
            return false;
        }
    }

    /**
     * 查询用户是否登录，没有登录返回null，否则返回用户名
     * @param httpSession
     * @return
     */
    @RequestMapping("/layuimini/findAdminLogin")
    public Admin findAminLogin(HttpSession httpSession) {
//        System.out.println("asda");
        if (httpSession.getAttribute("admin") == null) {
            return null;
        }
        return (Admin) httpSession.getAttribute("admin");
    }



    @RequestMapping("layuimini/exitAdmin")

    public String exitAdmin(HttpSession httpSession) {
        httpSession.removeAttribute("admin");
        return "退出成功";

    }
}
