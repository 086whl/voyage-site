package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.Admin;
import cn.edu.nuist.voyagesite.mapper.AdminMapper;
import cn.edu.nuist.voyagesite.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin findAdmin(String username, String password) {
        Admin admin = adminMapper.findAdmin(username, password);
       return admin;
    }

    @Override
    public void updatePassword(String username, String password) {
        adminMapper.update(username, password);
    }
}
