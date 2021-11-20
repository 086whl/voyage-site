package cn.edu.nuist.voyagesite.controller;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.domain.UserListInfo;
import cn.edu.nuist.voyagesite.service.UserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")

    UserService userService;
//此处应该用IOC
    UserListInfo userListInfo = new UserListInfo();

    /**
     * 登录用户
     *
     * @return 返回true，用户存在
     */
    @SneakyThrows
    @RequestMapping("loginUser")
    public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession httpSession, ModelAndView modelAndView) {
        User user = userService.isExistUser(username, password);
        if (user != null) {
            httpSession.setAttribute("user", user);
            modelAndView.setViewName("redirect:index.html");
            return modelAndView;
        } else {
            modelAndView.addObject("msg", "用户名密码错误");
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

        boolean ifCanUse = userService.findUsername(registerUser.getUsername());
//        如果可有返回true，注册用户
        if (ifCanUse) {
            boolean register = userService.register(registerUser);
        }
        return ifCanUse;
    }

    /**
     * 查询用户是否登录
     *
     * @param session zzz
     * @param model   zzz
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
     * @param username    zzz
     * @param httpSession zzz
     * @return zzz
     */
    @RequestMapping("exitUser")
    public String exitUser(String username, HttpSession httpSession) {
        User user = (User) httpSession.getAttribute("user");
        if (user != null) {
            httpSession.removeAttribute("user");
        }
        return "exit";
    }

    /**
     * 查询所有用户
     */
    @RequestMapping("findAllUser")
    public String findAllUser(@RequestParam("page") int page, @RequestParam("limit") int limit) {
        List<User> allUser = userService.findAllUser(((page - 1) * limit), limit);
        //封装
        userListInfo.setCode(0);
        userListInfo.setMsg("success");
        userListInfo.setData(allUser);
        userListInfo.setCount(allUser.size());
        //转为json
        String userList = JSON.toJSONString(userListInfo);
        return userList;
    }

    /**
     * 根据用户名模糊查询用户信息
     *
     * @param username 根据用户名模糊查询
     */
    @RequestMapping("findUserByUsername")
    public String findUserByUsername(@RequestParam("page") int page,@RequestParam("limit") int limit,@RequestParam("username") String username) {
        List<User> userByUsername = userService.findUserByUsername(username,((page - 1) * limit), limit);
        //封装

        userListInfo.setCode(0);
        userListInfo.setMsg("success");
        userListInfo.setData(userByUsername);
        userListInfo.setCount(userByUsername.size());
        //转为json
        String userList = JSON.toJSONString(userListInfo);
        return userList;
    }

    /***
     * 更新用户信息
     *   更新的用户信息
     * @return 返回更新结果是否成功 true成功
     */
    @RequestMapping("updateUserInfo")
    public boolean updateUserInfo(@RequestParam("editJson") String editJson) {
        JSONObject userJson = JSONObject.parseObject(editJson);
        User user=JSON.toJavaObject(userJson,User.class);
        boolean ifCanUse = userService.findUsername(user.getUsername());
        if (!ifCanUse) {//false不能用
            userService.updateUserInfo(user);
        }

//        System.out.println("user = " + user);
        return !ifCanUse;
    }

    /**
     * 根据用户uid删除用户信息
     *
     * @param uids
     * @return 返回true删除成功
     */
    @RequestMapping("deleteUser")
    public boolean deleteUser(@RequestParam("uid") List uids) {
        return userService.deleteUser(uids);
    }
}
