package com.example.heroku_api_gateway.controller;

import com.example.heroku_api_gateway.model.StandardResponseBody;
import com.example.heroku_api_gateway.model.enums.StandardResponseBodyDetail;
import com.example.heroku_api_gateway.model.enums.StandardResponseBodyMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class MainController {
  
  private final String rootPath = "/";
  
  //public ResponseEntity(@Nullable T body, @Nullable MultiValueMap<String, String> headers, HttpStatusCode statusCode)
  @GetMapping(rootPath)
  public ResponseEntity<StandardResponseBody> main(){
    StandardResponseBody standardResponseBody = new StandardResponseBody(
        StandardResponseBodyMessage.SUCCESS,
        StandardResponseBodyDetail.NO_DETAIL
    );
    return ResponseEntity.status(HttpStatus.OK).body(standardResponseBody);
  }
  
}
