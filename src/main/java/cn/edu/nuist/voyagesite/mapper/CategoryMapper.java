package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.Category;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.ManagedBean;
import java.util.List;

/**
 * @Description: 分类
 * @author: whl
 * @date: 2021年11月6日23点12分
 */
@Mapper
public interface CategoryMapper {
    List<Category> findAll();
}
