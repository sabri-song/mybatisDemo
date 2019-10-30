package com.mybatis.demo.dao;

import com.mybatis.demo.dto.SearchData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface ReportMapper {

    List<Map<String,Object>> getReport1(@Param("searchData") SearchData searchData);
    List<Map<String,Object>> getReport2(@Param("maxDate")String maxDate,@Param("minDate")String minDate);
    List<Map<String,Object>> getReport3(@Param("maxDate") Date maxDate, @Param("minDate")Date minDate);
}
