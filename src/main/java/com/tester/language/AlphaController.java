package com.tester.language;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlphaController {

  @Value("${greeting}")
  public String greeting;

  @GetMapping("status")
  public String getStatus() {
    return greeting;
  }
}