package com.reimbursement.rmiproject.exception;

public class ValidationsException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ValidationsException(String message) {
        super(message);
    }
}
