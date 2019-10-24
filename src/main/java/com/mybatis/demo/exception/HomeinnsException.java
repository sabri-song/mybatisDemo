package com.mybatis.demo.exception;

import com.mybatis.demo.enums.CommonEnum;
import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/11/8 10:49
 * @email: linma@homeinns.com
 **/
@Getter
public class HomeinnsException extends RuntimeException {

    private Integer code;

    public HomeinnsException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public HomeinnsException(CommonEnum commonEnum) {
        this(commonEnum.getCode(), commonEnum.getMessage());
    }

}
