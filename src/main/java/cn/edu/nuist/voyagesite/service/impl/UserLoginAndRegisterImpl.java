package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.mapper.UserMapper;
import cn.edu.nuist.voyagesite.service.UserLoginAndRegister;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserLoginAndRegisterImpl implements UserLoginAndRegister {
    @Resource
    private UserMapper userMapper;

    @Override
    public User isExistUser(String username, String password) {

        User userMapperByUsernameAndPassword = userMapper.findByUsernameAndPassword(username, password);

        return userMapperByUsernameAndPassword;
    }

    @Override
    public boolean register(User user) {
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
