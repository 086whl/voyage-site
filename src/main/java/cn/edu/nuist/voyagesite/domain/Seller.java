package cn.edu.nuist.voyagesite.domain;

import lombok.Data;

/**
 * @Description: 商家实体类
 * @author: whl
 * @date: 2021年11月6日22点36分
 */
@Data
public class Seller {
    private int sid;//商家id
    private String sname;//商家名称
    private String consphone;//商家电话
    private String address;//商家地址

    /**
     * 无参构造方法
     */
    public Seller(){}

    /**
     * 有参构造方法
     * @param sid
     * @param sname
     * @param consphone
     * @param address
     */
    public Seller(int sid, String sname, String consphone, String address) {
        this.sid = sid;
        this.sname = sname;
        this.consphone = consphone;
        this.address = address;
    }
}
