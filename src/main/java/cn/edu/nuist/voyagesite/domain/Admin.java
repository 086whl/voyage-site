package cn.edu.nuist.voyagesite.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private int adminId;
    private String admin;
    private String password;
}
