package cn.edu.nuist.voyagesite;

import cn.edu.nuist.voyagesite.domain.DataSetPackage;
import cn.edu.nuist.voyagesite.domain.PieDataPackage;
import cn.edu.nuist.voyagesite.service.impl.ChartsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DataTest {
    @Autowired
    private ChartsServiceImpl chartsService;
    @Test
    public void pieData(){
        List<PieDataPackage> pieDataPackages = chartsService.pieData();
        System.out.println(pieDataPackages);
    }
    @Test
    public void dataSetData(){
        List<DataSetPackage> dataSetPackages = chartsService.dataSetData();
        System.out.println(dataSetPackages);
    }
}
