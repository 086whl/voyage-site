package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserLoginAndRegister {
    /**
     * 判断是否用户存在，
     * @return 用户存在返回用户信息，否则返回为空
     * @param username 用户名
     * @param password  密码
     */
    User isExistUser(String username,String password) throws Exception;

    /**
     * 注册user
     * @return (注册成功返回true，否则返回false)
     */
    boolean register(User user) throws Exception;

    boolean findUsername(String username);

}
