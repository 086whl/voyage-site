package cn.edu.nuist.voyagesite.domain;

import lombok.Data;
/**
 * @Description: 旅游线路商品详情实体类
 * @author: whl
 * @date: 2021年11月9日19点43分
 */
@Data
public class RouteDetail {
    private Route route;        //路线
    private Seller seller;      //销售方
    private Category category;  //分类
    public RouteDetail() {
    }

    public RouteDetail(Route route, Seller seller) {
        this.route = route;
        this.seller = seller;
    }
}
