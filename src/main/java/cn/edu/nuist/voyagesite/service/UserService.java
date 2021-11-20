package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
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

    /**
     * 根据用户名查询用户是否存在
     * @param username
     * @return
     */
    boolean findUsername(String username);

    /**
     * 查询所有的用户
     * @return 返回list集合
     */
    List<User> findAllUser(int page,int limit);

    /**
     * 查询用户模糊匹配
     * @param username 用户名模糊匹配
     * @return 返回一个用户
     */
    List<User> findUserByUsername(String username,int page,int limit);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    boolean updateUserInfo(User user);

    /**
     * 删除用户
     * @param uid 依据uid
     * @return true删除成功
     */
    boolean deleteUser(int uid);
}
