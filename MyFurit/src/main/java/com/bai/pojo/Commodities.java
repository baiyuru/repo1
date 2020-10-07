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
public class Commodities {

    private Integer fid;

    private String fruitid;

    private String name;

    private Double price;

    private String locality;

    private Date createtime;

    private int number;

    private List<Accessory> accessoryList;

}