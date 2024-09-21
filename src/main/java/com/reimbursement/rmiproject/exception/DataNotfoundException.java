package com.reimbursement.rmiproject.exception;

public class DataNotfoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DataNotfoundException(String message) {
        super(message);
    }
}
