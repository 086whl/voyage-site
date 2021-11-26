package cn.edu.nuist.voyagesite.mapper;

import cn.edu.nuist.voyagesite.domain.PieDataPackage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description: 后台统计图表
 * @author: whl
 * @date: 2021年11月26日19点39分
 */
@Mapper
public interface ChartsMapper {
    public List<PieDataPackage> pieData();
}
