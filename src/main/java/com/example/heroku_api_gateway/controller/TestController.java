package com.example.heroku_api_gateway.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
  private final String rootPath = "/test";

  @GetMapping(rootPath)
  public String main(){
    return "Hello This is Test Controller.";
  }
  @GetMapping(rootPath+"/1")
  public String test(){
    return "Hello. Let's check Heroku CI";
  }
}
