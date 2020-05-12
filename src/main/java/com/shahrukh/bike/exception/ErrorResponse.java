package com.shahrukh.bike.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

  private Date timestamp;
  private String status;
  private String message;
  private String details;

 
}
