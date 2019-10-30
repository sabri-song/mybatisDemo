package com.mybatis.demo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SearchData {
    private Date maxDate;
    private Date minDate;
}
