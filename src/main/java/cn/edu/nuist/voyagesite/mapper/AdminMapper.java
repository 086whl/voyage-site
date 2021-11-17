package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {

    //    查询Admin
    Admin findAdmin(@Param("admin") String username, @Param("password") String password);

    //    修改admin密码
    void update(@Param("admin") String username, @Param("password") String password);

    //修改管理员信息
    boolean updateAdminInfo(@Param("admin") String admin,@Param("phone")String phone,@Param("email")String email,@Param("message")String message);
}
