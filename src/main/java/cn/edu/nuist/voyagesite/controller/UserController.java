package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.service.UserLoginAndRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserLoginAndRegister userLoginAndRegister;
    /**
     * 登录用户
     * @return
     */
    @RequestMapping("/loginUser")
    public int login(User user){

        User existUser = userLoginAndRegister.isExistUser(user.getUsername(), user.getPassword());
        if (existUser == null) {
            return 0;
        }
        return 1;
    }

    /**
     * 注册用户
     * @return
     */
    @RequestMapping("/registerUser")
    public String registerUser(User user){
        userLoginAndRegister.register(user);
        return "ok";
    }

}
