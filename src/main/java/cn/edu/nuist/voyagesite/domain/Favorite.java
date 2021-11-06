package cn.edu.nuist.voyagesite.domain;

import lombok.Data;

/**
 * @Description: 收藏实体类
 * @author: whl
 * @date: 2021年11月6日22点32分
 */
@Data
public class Favorite {
    private Route route;//旅游线路对象
    private String date;//收藏时间
    private User user;//所属用户

    /**
     * 无参构造方法
     */
    public Favorite() {
    }

    /**
     * 有参构造方法
     * @param route
     * @param date
     * @param user
     */
    public Favorite(Route route, String date, User user) {
        this.route = route;
        this.date = date;
        this.user = user;
    }

}
