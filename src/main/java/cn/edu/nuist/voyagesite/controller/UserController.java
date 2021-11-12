package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.service.UserLoginAndRegister;
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
     * @return
     */
    @RequestMapping("loginUser")
    public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password, ModelAndView modelAndView, HttpSession httpSession) {


       User user = userLoginAndRegister.isExistUser(username, password);


        if (user != null) {

            modelAndView.addObject("user", user);
            httpSession.setAttribute("user", user);
            modelAndView.addObject("msg", "登录成功");
            modelAndView.setViewName("index");
        } else {

            modelAndView.addObject("msg", "登录失败，用户名或密码错误请重新输入");
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }

    /**
     * 注册用户
     *
     * @return
     */
    @RequestMapping("/registerUser")
    public boolean registerUser(User registerUser) {
        boolean register = userLoginAndRegister.register(registerUser);

        return register;
    }

    /**
     *
     */
    @RequestMapping("/findUser")
    public User findUser(HttpSession session, Model model) {
        User user = null;
        user= (User) session.getAttribute("user");
        return user;
    }

    @RequestMapping("exitUser")
    public String exitUser(String username, HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("username");
        if(user != null){
            httpSession.removeAttribute("username");
        }
        return "exit";
    }

}
