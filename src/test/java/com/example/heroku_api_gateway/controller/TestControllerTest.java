package com.example.heroku_api_gateway.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TestController.class)
class TestControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  void main() {
  }

  @Test
  void test1() throws Exception {
    mockMvc.perform(get("/test/1"))
        .andExpect(status().isOk())
        .andExpect(content().string("Hello. Let's check Heroku CI"));
  }
}