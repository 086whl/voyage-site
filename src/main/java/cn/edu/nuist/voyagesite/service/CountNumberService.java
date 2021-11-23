package cn.edu.nuist.voyagesite.service;

import org.springframework.stereotype.Service;

@Service
public interface CountNumberService {
    int countAllUser();

    int countAllRoute();

    int countAllFavorite();
}
