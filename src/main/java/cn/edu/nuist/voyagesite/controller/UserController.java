package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.service.UserLoginAndRegister;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired
    @Qualifier("userLoginAndRegisterImpl")

    UserLoginAndRegister userLoginAndRegister;

    /**
     * 登录用户
     *
     * @return 返回true，用户存在
     */
    @SneakyThrows
    @RequestMapping("loginUser")
    public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession httpSession,ModelAndView modelAndView) {
        User user = userLoginAndRegister.isExistUser(username, password);
        if (user != null) {
            httpSession.setAttribute("user", user);
            modelAndView.setViewName("redirect:index.html");
            return modelAndView;
        } else {
            modelAndView.addObject("msg","用户名密码错误");
            modelAndView.setViewName("login");
            return modelAndView;
        }
    }

    /**
     * 注册用户
     *
     * @return 返回true 注册成功
     */
    @SneakyThrows
    @RequestMapping("/registerUser")
    public boolean registerUser(User registerUser) {

        boolean ifCanUse = userLoginAndRegister.findUsername(registerUser.getUsername());
//        如果可有返回true，注册用户
        if (ifCanUse) {
            boolean register = userLoginAndRegister.register(registerUser);
        }
        return ifCanUse;
    }
    /**
     * 查询用户是否登录
     *
     * @param session zzz
     * @param model zzz
     * @return zzzz
     */
    @RequestMapping("/findUser")
    public User findUser(HttpSession session, Model model) {
        User user;
        user = (User) session.getAttribute("user");
        return user;
    }

    /**
     * 退出登录
     *
     * @param username zzz
     * @param httpSession zzz
     * @return zzz
     */
    @RequestMapping("exitUser")
    public String exitUser(String username, HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("user");
        if(user != null){
            httpSession.removeAttribute("user");
        }
        return "exit";
    }

}
