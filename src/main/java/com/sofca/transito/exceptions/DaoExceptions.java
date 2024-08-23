package com.sofca.transito.exceptions;

public class DaoExceptions  extends  Exception{
    public DaoExceptions() {
        super();
    }

    public DaoExceptions(String message) {
        super(message);
    }

    public DaoExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public DaoExceptions(Throwable cause) {
        super(cause);
    }

    protected DaoExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
