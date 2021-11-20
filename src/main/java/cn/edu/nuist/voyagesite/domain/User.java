package cn.edu.nuist.voyagesite.domain;

import lombok.*;

/**
 * @Description: 用户实体类
 * @author: whl
 * @date: 2021年11月6日22点33分
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    private int uid;//用户id
    private String username;//用户名，账号
    private String password;//密码
    private String name;//真实姓名
    private String birthday;//出生日期
    private String sex;//男或女
    private String telephone;//手机号
    private String email;//邮箱
    private String status;//激活状态，Y代表激活，N代表未激活
    private String code;//激活码（要求唯一）


}
