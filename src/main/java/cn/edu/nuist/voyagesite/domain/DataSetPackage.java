package cn.edu.nuist.voyagesite.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @Description: 用于封装后端返回后台柱状图的数据
 * @author: whl
 * @date: 2021年11月26日20点29分
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataSetPackage {
    private String name;
    private int sum;
    private int favorite;
}
