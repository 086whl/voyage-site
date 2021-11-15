package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.mapper.UserMapper;
import cn.edu.nuist.voyagesite.service.UserLoginAndRegister;
import cn.edu.nuist.voyagesite.util.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserLoginAndRegisterImpl implements UserLoginAndRegister {
    @Resource
    private UserMapper userMapper;

    @Override
    public User isExistUser(String username, String password) throws Exception {
        //用户密码MD5加密
        String pwMd5= Md5Util.encodeByMd5(password);
        User userMapperByUsernameAndPassword = userMapper.findByUsernameAndPassword(username, pwMd5);

        return userMapperByUsernameAndPassword;
    }

    @Override
    public boolean register(User user) throws Exception {
        //用户密码MD5加密
        //获取用户明文密码
        String pw=user.getPassword();
        //加密
        String pwMd5= Md5Util.encodeByMd5(pw);
        user.setPassword(pwMd5);
        //判断用户是否填写生日信息
        if(user.getBirthday().equals("")){
            user.setBirthday(null);
        }
        return userMapper.save(user);
    }

    /**
     * 返回ture表示可以使用该名字
     * @param username 注册的名字
     * @return
     */
    @Override
    public boolean findUsername(String username) {
        String username1 = userMapper.findUsername(username);
        if (username1 != null){
        return false;
        }
        else {
            return true;
        }
    }
}
