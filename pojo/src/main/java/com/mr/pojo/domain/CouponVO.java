package com.mr.pojo.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class CouponVO {
    private Integer cid;
    private Double cmoney;
    private String cName;
    private String cCondition;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cDateb;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cDateE;
}
