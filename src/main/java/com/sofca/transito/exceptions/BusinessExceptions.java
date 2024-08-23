package com.sofca.transito.exceptions;

public class BusinessExceptions extends Exception {
    public BusinessExceptions() {
        super();
    }

    public BusinessExceptions(String message) {
        super(message);
    }

    public BusinessExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessExceptions(Throwable cause) {
        super(cause);
    }

    protected BusinessExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
