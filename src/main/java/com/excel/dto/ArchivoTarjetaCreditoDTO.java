package com.excel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArchivoTarjetaCreditoDTO implements Serializable {

  private Long id;
  private String glosa;
  private String vigente;
  private String tm;
  private String cuenta;
  private String aux;
  private String cenco;
  private String sucursal;
  private BigDecimal monto;
  private String rut;
  private String moneda;
  private String logo;
}
