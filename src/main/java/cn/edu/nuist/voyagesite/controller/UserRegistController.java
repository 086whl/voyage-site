package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 用户注册
 * @author: whl
 * @date: 2021年11月7日13点11分
 */
@Controller
public class UserRegistController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;
    @RequestMapping(value="/regist")
    public String regist(HttpServletRequest request){
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setName(request.getParameter("name"));
        user.setBirthday(request.getParameter("birthday"));
        user.setSex(request.getParameter("sex"));
        user.setTelephone(request.getParameter("telephone"));
        user.setEmail(request.getParameter("email"));
        user.setStatus("1");
        user.setCode("1");
        userService.regist(user);
        return "redirect:/register_ok.html";
    }
//    @RequestMapping("/regist")
//    public void regist(String username,
//                         String password,
//                         String name,
//                         String birthday,
//                         String sex,
//                         String telephone,
//                         String email,
//                         String status,
//                         String code){
//        User user=new User(username,password,name,birthday,sex,telephone,email,status,code);
//        userService.regist(user);
//    }
}
