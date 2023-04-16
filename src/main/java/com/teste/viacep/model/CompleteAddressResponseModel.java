package com.teste.viacep.model;

import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class CalculateFrieghtResponseModel {
  private String cep;
  private String logradouro;
  private String complemento;
  private String bairro;
  private String localidade;
  private String uf;
  private String ibge;
  private String gia;
  private String ddd;
  private String siafi;
}
