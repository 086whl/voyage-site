package cn.edu.nuist.voyagesite;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void findByUsernameAndPassword(){
        User userMapperByUsernameAndPassword = userMapper.findByUsernameAndPassword("yf", "123");
        System.out.println(userMapperByUsernameAndPassword);
    }
    @Test
    public void saveTest(){
        User user = new User();
        user.setUsername("yff");
        user.setPassword("122");
    }
}
