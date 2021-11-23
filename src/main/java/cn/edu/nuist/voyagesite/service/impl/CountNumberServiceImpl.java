package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.mapper.CountNumberMapper;
import cn.edu.nuist.voyagesite.service.CountNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountNumberServiceImpl implements CountNumberService {
    @Autowired
    CountNumberMapper countNumberMapper;

    @Override
    public int countAllUser() {

        return countNumberMapper.countAllUser();
    }

    @Override
    public int countAllRoute() {
        return countNumberMapper.countAllRoute();
    }

    @Override
    public int countAllFavorite() {
        return countNumberMapper.countAllFavorite();
    }
}
