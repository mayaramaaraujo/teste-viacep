package com.teste.viacep.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ViaCepParameters {

  @Value("${viacep.url}")
  private String url;

  @Value("${viacep.type}")
  private String type;

  public String getUrl() {
    return url;
  }

  public String getType() {
    return type;
  }
}
