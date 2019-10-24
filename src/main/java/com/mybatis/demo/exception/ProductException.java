package com.mybatis.demo.exception;

import com.mybatis.demo.enums.ProductEnum;

/**
 * @author：linma
 * @date: 2018/11/9 10:25
 * @email: linma@homeinns.com
 **/
public class ProductException extends HomeinnsException {

    public ProductException(ProductEnum productEnum) {
        super(productEnum.getCode(), productEnum.getMessage());
    }

}
