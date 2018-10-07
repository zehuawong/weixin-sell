package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by wzh-zhua on 2018/10/7.
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
