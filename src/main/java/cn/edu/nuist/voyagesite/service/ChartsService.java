package cn.edu.nuist.voyagesite.service;

import cn.edu.nuist.voyagesite.domain.DataSetPackage;
import cn.edu.nuist.voyagesite.domain.PieDataPackage;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 后台统计图表服务类
 * @author: whl
 * @date: 2021年11月26日19点39分
 */
@Service
public interface ChartsService {
    //饼图数据
    List<PieDataPackage> pieData();
    //柱状图数据
    List<DataSetPackage> dataSetData();

}
