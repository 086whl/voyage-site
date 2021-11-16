package cn.edu.nuist.voyagesite;

import cn.edu.nuist.voyagesite.domain.Admin;
import cn.edu.nuist.voyagesite.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminTest {
    @Autowired
    AdminMapper adminMapper;
    @Test
    public void findTest(){
        Admin admin = adminMapper.findAdmin("root", "123");
        System.out.println("admin = " + admin);
        adminMapper.update("root","root");
    }
}
