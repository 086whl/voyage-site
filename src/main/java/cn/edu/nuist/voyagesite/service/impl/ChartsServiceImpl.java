package cn.edu.nuist.voyagesite.service.impl;

import cn.edu.nuist.voyagesite.domain.DataSetPackage;
import cn.edu.nuist.voyagesite.domain.PieDataPackage;
import cn.edu.nuist.voyagesite.mapper.ChartsMapper;
import cn.edu.nuist.voyagesite.service.ChartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 后台统计图表服务实现类
 * @author: whl
 * @date: 2021年11月26日19点39分
 */
@Service
public class ChartsServiceImpl implements ChartsService {
    @Autowired
    private ChartsMapper chartsMapper;
    @Override
    public List<PieDataPackage> pieData() {
        List<PieDataPackage> pieDataPackages = chartsMapper.pieData();
        return pieDataPackages;
    }

    @Override
    public List<DataSetPackage> dataSetData() {
        List<DataSetPackage> dataSetPackages = chartsMapper.dataSetData();
        return dataSetPackages;
    }
}
