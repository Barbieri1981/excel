package com.excel.dto;

import java.io.Serializable;
import java.util.List;


public class  GenerarDocumentoContableRequestDTO implements Serializable {
    private List<EventoDTO> abonos;

    public List<EventoDTO> getAbonos() {
        return abonos;
    }

    public void setAbonos(List<EventoDTO> abonos) {
        this.abonos = abonos;
    }
}
