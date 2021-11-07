package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.mapper.UserMapper;
import cn.edu.nuist.voyagesite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Description: 用户相关实现类
 * @author: whl
 * @date: 2021年11月7日14点24分
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean regist(User user) {
        //判断用户是否存在

        if(!userMapper.userNameIsExist(user.getUsername())){
            //添加注册信息
            userMapper.regist(user);
            return true;
        }else {
            //用户已存在注册失败
            return false;
        }

    }

    @Override
    public User login(User user) {
        return null;
    }
}
