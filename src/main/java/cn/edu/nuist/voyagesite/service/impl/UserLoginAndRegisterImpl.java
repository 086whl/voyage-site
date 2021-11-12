package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.mapper.UserMapper;
import cn.edu.nuist.voyagesite.service.UserLoginAndRegister;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;

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
}
