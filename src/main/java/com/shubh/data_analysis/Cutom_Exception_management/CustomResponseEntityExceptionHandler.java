package com.shubh.data_analysis.Cutom_Exception_management;

import java.time.LocalDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Usernotfound.class)
    public final ResponseEntity<Object> handleUserNotFoundException(Usernotfound ex, WebRequest request) {
      //get current date
      
      CustomExceptionformat error = new CustomExceptionformat(LocalDate.now(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

     @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
         CustomExceptionformat error = new CustomExceptionformat(LocalDate.now(),ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
