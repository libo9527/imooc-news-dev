package com.imooc.api.exception;

import com.imooc.grace.result.ResponseStatusEnum;

/**
 * @author bo li
 * @date 2020-12-22 16:06
 */
public class GraceException {

    public static void display(ResponseStatusEnum responseStatusEnum) {
        throw new MyCustomException(responseStatusEnum);
    }

}
