package com.mybatis.demo.enums;

import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/11/9 10:26
 * @email: linma@homeinns.com
 **/
@Getter
public enum ProductEnum {

    /**
     * 商品不存在
     */
    PRODUCT_NOT_EXIST(1, "商品不存在");

    private Integer code;

    private String message;

    ProductEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
