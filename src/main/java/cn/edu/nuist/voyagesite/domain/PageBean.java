package cn.edu.nuist.voyagesite.domain;

import lombok.Data;

import java.util.List;

/**
 * @Description: 分页对象
 * @author: whl
 * @date: 2021年11月6日22点38分
 */
@Data
public class PageBean<T> {
    private long totalCount;//总记录数
    private long totalPage;//总页数
    private int currentPage;//当前页码
    private int pageSize;//每页显示的条数

    private List<T> list;//每页显示的数据集合
}
