package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.User;
import org.springframework.stereotype.Service;

/**
 * @Description: 用户相关服务类
 * @author: whl
 * @date: 2021年11月7日12点13分
 */

public interface UserService {
    /**
     * 注册用户
     * @param user
     * @return
     */
    boolean regist(User user);

    /**
     * 用户登录
     * @param user
     * @return
     */
    User login(User user);
}
