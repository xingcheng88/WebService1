package com.xingcheng.exception;

import javax.xml.ws.WebFault;

/**
 * @author XingCheng
 * @date 14.06.2019
 */
@WebFault(faultBean = "com.xingcheng.exception.NonKeySpecifiedExceptionBean")
public class NonKeySpecifiedException extends Exception {
    private final NonKeySpecifiedExceptionBean fault;

    public NonKeySpecifiedException(String message, NonKeySpecifiedExceptionBean fault) {
        super(message);
        this.fault = fault;
    }

    public NonKeySpecifiedException(String message, NonKeySpecifiedExceptionBean fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public NonKeySpecifiedExceptionBean getFaultInfo() {
        return fault;
    }
}
