package cn.edu.nuist.voyagesite.domain;

import lombok.Data;

/**
 * @Description: 分类实体类
 * @author: whl
 * @date: 2021年11月6日22点28分
 */
@Data
public class Category {
    private int cid;//分类id
    private String cname;//分类名称
    /**
     * 无参构造方法
     */
    public Category() {
    }
    /**
     * 有参构方法
     * @param cid
     * @param cname
     */
    public Category(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

}
