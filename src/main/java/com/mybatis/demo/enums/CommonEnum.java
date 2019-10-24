package com.mybatis.demo.enums;

import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/11/8 10:55
 * @email: linma@homeinns.com
 **/
@Getter
public enum CommonEnum {

    ;

    private Integer code;

    private String message;

    CommonEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
