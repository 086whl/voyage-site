package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    boolean save(User user) ;

    User findByUsernameAndPassword(String username, String pwMd5);


    String findUsername(String username);

    List<User> findUserByUsername(String username,int page,int limit);

    boolean updateUserInfo(User user);

    boolean deleteUser(int uid);

    List<User> findAllUser(int page,int limit);
}
