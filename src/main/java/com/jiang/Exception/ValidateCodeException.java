package com.jiang.Exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author: superman
 * @Date: 2020/2/16 16:15
 * @Version 1.0
 */
public class ValidateCodeException extends AuthenticationException {
    private static final long serialVersionUID = 5022575393500654458L;

    public ValidateCodeException(String message) {
        super(message);
    }
}