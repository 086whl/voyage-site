package cn.edu.nuist.voyagesite.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RutePackage {
    private int code;
    private String msg;
    private int count;
    private List<Route> data;
}
