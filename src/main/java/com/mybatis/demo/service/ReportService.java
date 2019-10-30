package com.mybatis.demo.service;

import com.mybatis.demo.dto.SearchData;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ReportService {

    List<Map<String,Object>> getReport1(SearchData searchData);
    List<Map<String,Object>> getReport2(String maxDate, String minDate);
    List<Map<String,Object>> getReport3(Date maxDate, Date minDate);
}
