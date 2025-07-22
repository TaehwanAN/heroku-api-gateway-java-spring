package com.example.heroku_api_gateway.model;

import com.example.heroku_api_gateway.model.enums.StandardResponseBodyDetail;
import com.example.heroku_api_gateway.model.enums.StandardResponseBodyMessage;
import lombok.*;

import java.util.UUID;

public class StandardResponseBody {
  private final UUID id;
  private StandardResponseBodyMessage message;
  private StandardResponseBodyDetail detail;
  
  public StandardResponseBody(StandardResponseBodyMessage message, StandardResponseBodyDetail detail){
    this.id = UUID.randomUUID();
    this.message = message;
    this.detail = detail;
  }
  
  
  public UUID getId() {
    return id;
  }
  
  public StandardResponseBodyMessage getMessage() {
    return message;
  }
  
  public StandardResponseBodyDetail getDetail() {
    return detail;
  }
}
