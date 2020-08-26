package com.excel.excel.dto;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class  GenerarDocumentoContableRequestDTO implements Serializable {
    private List<EventoDTO> abonos;

}
