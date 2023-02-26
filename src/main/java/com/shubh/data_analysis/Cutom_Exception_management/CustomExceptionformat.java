package com.shubh.data_analysis.Cutom_Exception_management;

import java.time.LocalDate;

public class CustomExceptionformat {
   private LocalDate timestamp;
  private String message;
  private String details;

  public CustomExceptionformat(LocalDate timestamp, String message, String details) {
    super();
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }

   public LocalDate getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }

  public String getDetails() {
    return details;
  }
  
  
}
