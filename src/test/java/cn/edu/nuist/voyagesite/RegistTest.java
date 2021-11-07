package cn.edu.nuist.voyagesite;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RegistTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void userNameIsNull(){
        String username="whl1";
        System.out.println(userMapper.userNameIsExist(username));

    }
    @Test
    public void userRegist(){
        User user=new User("whl","123","whl123","2021-10-01","男","18500000000","123@gmail.com","1","1");
        userMapper.regist(user);
    }
}
