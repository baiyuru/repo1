package com.bai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MiddleTab {
    private Integer mid;

    private String middleid;

    private String contractid;

    private Integer fruitid;

    private Integer number;


}