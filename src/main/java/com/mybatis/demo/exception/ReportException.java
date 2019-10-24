package com.mybatis.demo.exception;


import com.mybatis.demo.enums.ReportEnum;

/**
 * @author：linma
 * @date: 2018/11/11 14:42
 * @email: linma@homeinns.com
 **/
public class ReportException extends HomeinnsException {

    public ReportException(ReportEnum reportEnum) {
        super(reportEnum.getCode(), reportEnum.getName());
    }
}
