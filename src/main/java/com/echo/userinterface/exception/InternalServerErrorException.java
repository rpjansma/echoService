package com.echo.userinterface.exception;


public class InternalServerErrorException extends RuntimeException {

    public InternalServerErrorException(String msg) {
        super(msg);
    }

    private InternalServerErrorException() {
    }
}
