package cn.edu.nuist.voyagesite.domain;

import lombok.Data;

import java.util.List;

@Data
public class UserListInfo {
    private int code;
    private String msg;
    private int count;
    private List<User> data;
}
