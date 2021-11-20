package cn.edu.nuist.voyagesite;

import cn.edu.nuist.voyagesite.domain.User;
import cn.edu.nuist.voyagesite.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

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
    public void findUserByUsernameTest(){

        List<User> userByUsername = userMapper.findUserByUsername("te",1,1);
        System.out.println("te = " + userByUsername);

    }
    @Test
    public void findAllUserTest(){

        List<User> userByUsername = userMapper.findAllUser(1,1);
        System.out.println("te = " + userByUsername);
    }
    @Test
    public void updateUserInfoTest(){
        User user = new User(21,"user",null,"yin",null,null,null,null,null,null);

        boolean userByUsername = userMapper.updateUserInfo(user);
        System.out.println("te = " + userByUsername);

    }
    @Test
    public void deleteUserInfo(){

        List list =new ArrayList();
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);

        boolean userByUsername = userMapper.deleteUser(list);
        System.out.println("te = " + userByUsername);

    }
    @Test
    public void findAllUSer(){

        List<User> allUser = userMapper.findAllUser(1,1);
        System.out.println("te = " + allUser);

    }
}
