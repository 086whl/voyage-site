package cn.edu.nuist.voyagesite.service;

import java.util.List;
import cn.edu.nuist.voyagesite.domain.Category;
/**
 * @Description: 分类
 * @author: whl
 * @date: 2021年11月6日23点04分
 */
public interface CategoryService {
    //所有分类
    public List<Category> findAll();
}
