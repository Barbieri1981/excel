package com.excel.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "documentos")
@Data
@Component
public class EstructuraBaseExcelDTO {

  private DevolucionSaldoAFavor devolucionSaldoAFavor = new DevolucionSaldoAFavor();

  @Data
  public static class DevolucionSaldoAFavor {
    private String nombre;
    private String extension;
    private String ruta;
    private String[] titulos;
  }
}
