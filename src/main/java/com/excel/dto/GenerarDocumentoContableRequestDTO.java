package com.excel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenerarDocumentoContableRequestDTO implements Serializable {
  private List<EventoDTO> abonos;

  public List<EventoDTO> getAbonos() {
    return abonos;
  }
}
