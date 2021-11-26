package cn.edu.nuist.voyagesite.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @Description: 用于封装后端返回后台饼图的数据
 * @author: whl
 * @date: 2021年11月26日19点36分
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PieDataPackage {
    private int value;
    private String name;
}
