package com.reimbursement.rmiproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ProductExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = DataNotfoundException.class)
    @ResponseBody
    public ResponseEntity<Object> dataNotFoundexception(DataNotfoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
    }

    @ExceptionHandler(value = ValidationsException.class)
    @ResponseBody
    public ResponseEntity<Object> validationException(ValidationsException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    @ResponseStatus(value = HttpStatus.PAYLOAD_TOO_LARGE)
    public ResponseEntity handleMultipartException(MaxUploadSizeExceededException e) {
        Map<String, String> result = new HashMap<>();
        result.put("message", "Error ==> Large File ");
        return  ResponseEntity.status(HttpStatus.PAYLOAD_TOO_LARGE)
                .body(result);

    }

}
