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
public class Accessory {


    private Integer accessoryid;

    private Integer fruitid;

    private String name;

    private String price;

    private Date createtime;


}