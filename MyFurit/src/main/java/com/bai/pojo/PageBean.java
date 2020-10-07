package com.bai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean{
    private int totalCont;//总记录数
    private int totalPage;//总页码数
    private int currentPage;//当前页码
    private int pageSize;//每页显示的条数



}
