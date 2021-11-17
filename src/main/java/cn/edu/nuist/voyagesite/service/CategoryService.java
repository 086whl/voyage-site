package cn.edu.nuist.voyagesite.service;

import java.util.List;
import cn.edu.nuist.voyagesite.domain.Category;
import org.springframework.stereotype.Service;

/**
 * @Description: 分类
 * @author: whl
 * @date: 2021年11月6日23点04分
 */
@Service
public interface CategoryService {
    //所有分类
    List<Category> findAll();
}
