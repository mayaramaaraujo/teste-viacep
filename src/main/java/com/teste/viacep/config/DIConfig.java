package com.teste.viacep.config;

import com.teste.viacep.service.CalculateFreightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DIConfig {

  @Autowired
  RestTemplate restTemplate;

  @Autowired
  ViaCepParameters viaCepParameters;

  @Bean
  public CalculateFreightService calculateFreightService(RestTemplate restTemplate) {
    return new CalculateFreightService(restTemplate, viaCepParameters);
  }

}
