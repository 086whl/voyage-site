package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description: 用户注册
 * @author: whl
 * @date: 2021年11月7日12点11分
 */
@Mapper
public interface UserMapper {
    /**
     * 用户名是否存在
     * @return
     */
    boolean userNameIsExist(String username);

    /**
     * 用户注册
     * @return
     */
    void regist(User user);
}
