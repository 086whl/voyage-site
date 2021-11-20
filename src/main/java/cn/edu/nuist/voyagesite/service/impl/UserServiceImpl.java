package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.mapper.UserMapper;
import cn.edu.nuist.voyagesite.service.UserService;
import cn.edu.nuist.voyagesite.util.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
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
     * @return false 用户名不能用
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
    /**
     * 查询所有的用户
     * @return 返回list集合
     */
    @Override
    public List<User> findAllUser(int page,int limit) {
        return userMapper.findAllUser(page,limit);
    }

    /**
     * 模糊查询用户信息
     * @return
     */
    @Override
    public List<User> findUserByUsername(String username,int page,int limit){
        List<User> userByUsername = userMapper.findUserByUsername(username,page,limit);
        return  userByUsername;
    }

    /**
     * 更新用户信息
     * @param user 更新的信息
     * @return 返回true更新欧克
     */
    @Override
    public boolean updateUserInfo(User user) {
        return userMapper.updateUserInfo(user);
    }

    /**
     * 删除用户信息
     * @param uid 依据uid
     * @return 返回true删除欧克
     */
    @Override
    public boolean deleteUser(List uids) {

        return  userMapper.deleteUser(uids);
    }

}

