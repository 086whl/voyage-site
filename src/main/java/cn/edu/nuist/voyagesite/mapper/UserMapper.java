package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    boolean save(User user) ;

    User findByUsernameAndPassword(String username, String pwMd5);


    String findUsername(String username);
}
