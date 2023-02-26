package com.shubh.data_analysis.Cutom_Exception_management;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Usernotfound extends RuntimeException {
    public Usernotfound(String message) {
        super(message);
    }
}
