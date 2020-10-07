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
public class Contract {


    private Integer cid;

    private String contractid;

    private String barcode;

    private Integer type;

    private Integer refailerid;

    private Date createtime;

    private String name;


}