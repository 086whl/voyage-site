package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
//    查询管理员是否存在
    Admin findAdmin(String username, String password);
//    修改管理员密码
    void updatePassword(String username, String password);

}
