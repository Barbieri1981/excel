package com.excel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventoDTO {

  private long id;
  private String numeroSalesforce;
  private String rutCliente;
  private boolean leyFraude;
  private LocalDateTime fechaAbono;
  private List<MovimientoDTO> movimientos;
  private String usuario;
}
