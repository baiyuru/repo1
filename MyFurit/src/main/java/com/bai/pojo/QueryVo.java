package com.bai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryVo {
    private String name;
    private String locality;
    private double price;
    private double startPrice;
    private double endPrice;
    private Date startTime;
    private Date endTime;

    private int totalCont;//总记录数
    private int totalPage;//总页码数
    private int currentPage;//当前页码
    private int pageSize;//每页显示的条数

    private Integer cid;
    private String contractid;
    private String barcode;
    private Integer type;
    private Integer refailerid;
    private Date createtime;

    private Retailer retailer;
    private List<Commodities> commoditiesList;
}
