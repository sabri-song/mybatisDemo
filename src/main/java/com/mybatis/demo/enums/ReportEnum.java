package com.mybatis.demo.enums;

import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/11/11 14:41
 * @email: linma@homeinns.com
 **/
@Getter
public enum ReportEnum {

    /**
     *
     */
    REPORT_DATA_NOT_NULL(1, "报表数据不可以为空！"),

    JRXML_PATH_NOT_FOUND(2, "jrxml路径文件没有发现！"),

    JRXML_FILE_NOT_ALLOWED_NULL(3, "jrxml文件不可以位空！");

    private Integer code;

    private String name;

    ReportEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
