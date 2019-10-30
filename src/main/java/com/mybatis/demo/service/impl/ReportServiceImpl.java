package com.mybatis.demo.service.impl;

import com.mybatis.demo.dao.ReportMapper;
import com.mybatis.demo.dto.SearchData;
import com.mybatis.demo.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    ReportMapper reportMapper;

    @Override
    public List<Map<String, Object>> getReport1(SearchData searchData) {
        return reportMapper.getReport1(searchData);
    }

    @Override
    public List<Map<String, Object>> getReport2(String maxDate, String minDate) {
        return reportMapper.getReport2(maxDate,minDate);
    }

    @Override
    public List<Map<String, Object>> getReport3(Date maxDate, Date minDate) {
        return reportMapper.getReport3(maxDate,minDate);
    }
}
