package com.excel.dto;

import java.time.LocalDateTime;
import java.util.List;

public class EventoDTO {

    private long id;
    private String numeroSalesforce;
    private String rutCliente;
    private boolean leyFraude;
    private LocalDateTime fechaAbono;
    private List<MovimientoDTO> movimientos;
    private String usuario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroSalesforce() {
        return numeroSalesforce;
    }

    public void setNumeroSalesforce(String numeroSalesforce) {
        this.numeroSalesforce = numeroSalesforce;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public boolean isLeyFraude() {
        return leyFraude;
    }

    public void setLeyFraude(boolean leyFraude) {
        this.leyFraude = leyFraude;
    }

    public LocalDateTime getFechaAbono() {
        return fechaAbono;
    }

    public void setFechaAbono(LocalDateTime fechaAbono) {
        this.fechaAbono = fechaAbono;
    }

    public List<MovimientoDTO> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<MovimientoDTO> movimientos) {
        this.movimientos = movimientos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
