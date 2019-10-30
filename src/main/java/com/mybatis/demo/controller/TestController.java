package com.mybatis.demo.controller;

import com.mybatis.demo.dto.SearchData;
import com.mybatis.demo.dto.User;
import com.mybatis.demo.service.ReportService;
import com.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private ReportService reportService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getReport1")
    public List<Map<String,Object>> getReport1(@RequestBody SearchData searchData){
        return reportService.getReport1(searchData);
    }

    @GetMapping("/getReport2")
    public List<Map<String,Object>> getReport2(@RequestParam String maxDate,@RequestParam String minDate){
        return reportService.getReport2(maxDate,minDate);
    }

//    @GetMapping("/getReport3")
//    public List<Map<String,Object>> getReport3(@RequestParam Date maxDate,@RequestParam Date minDate){
//        return reportService.getReport3(maxDate,minDate);
//    }
}
