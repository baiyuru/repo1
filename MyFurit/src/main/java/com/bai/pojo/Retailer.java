package com.bai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Retailer {


    private Integer rid;

    private Integer retailerid;

    private String name;

    private String telephone;

    private String address;

    private Integer status;

    private Date createtime;


}