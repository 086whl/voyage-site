package cn.edu.nuist.voyagesite;

import cn.edu.nuist.voyagesite.domain.Category;
import cn.edu.nuist.voyagesite.mapper.CategoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AllCategoryTest {
    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    public void findAll(){
        List<Category> category=categoryMapper.findAll();
        System.out.println(category.get(0).getCname());
    }
}
