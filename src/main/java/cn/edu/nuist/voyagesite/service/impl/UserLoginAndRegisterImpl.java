package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.mapper.UserMapper;
import cn.edu.nuist.voyagesite.service.UserLoginAndRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginAndRegisterImpl implements UserLoginAndRegister {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User isExistUser(String username,String password) {

        User userMapperByUsernameAndPassword = userMapper.findByUsernameAndPassword(username, password);

        return userMapperByUsernameAndPassword;
    }

    @Override
    public void register(User user) {

        userMapper.save(user);


    }
}
