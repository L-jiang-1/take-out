package com.mr.pojo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class EvaluateVO {
    private Integer eId;
    private String eEva;
    private Date eDate;
    private String ePeople;
}
