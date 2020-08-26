package com.excel.dto;

import java.time.LocalDateTime;

public class MovimientoDTO {

  private long id;
  private double monto;
  private LocalDateTime fechaTransaccion;
  private String tarjeta;
  private Integer cuenta;
  private String codigoTransaccion;
  private Integer codigoTipoMovimiento;
  private Integer codigoTipoProducto;
  private Integer codigoTipoTransaccion;
  private boolean reversa;
  private String logo;
  private Integer codigoTipoMoneda;
  private Integer vigente;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public double getMonto() {
    return monto;
  }

  public void setMonto(double monto) {
    this.monto = monto;
  }

  public LocalDateTime getFechaTransaccion() {
    return fechaTransaccion;
  }

  public void setFechaTransaccion(LocalDateTime fechaTransaccion) {
    this.fechaTransaccion = fechaTransaccion;
  }

  public String getTarjeta() {
    return tarjeta;
  }

  public void setTarjeta(String tarjeta) {
    this.tarjeta = tarjeta;
  }

  public Integer getCuenta() {
    return cuenta;
  }

  public void setCuenta(Integer cuenta) {
    this.cuenta = cuenta;
  }

  public String getCodigoTransaccion() {
    return codigoTransaccion;
  }

  public void setCodigoTransaccion(String codigoTransaccion) {
    this.codigoTransaccion = codigoTransaccion;
  }

  public Integer getCodigoTipoMovimiento() {
    return codigoTipoMovimiento;
  }

  public void setCodigoTipoMovimiento(Integer codigoTipoMovimiento) {
    this.codigoTipoMovimiento = codigoTipoMovimiento;
  }

  public Integer getCodigoTipoProducto() {
    return codigoTipoProducto;
  }

  public void setCodigoTipoProducto(Integer codigoTipoProducto) {
    this.codigoTipoProducto = codigoTipoProducto;
  }

  public Integer getCodigoTipoTransaccion() {
    return codigoTipoTransaccion;
  }

  public void setCodigoTipoTransaccion(Integer codigoTipoTransaccion) {
    this.codigoTipoTransaccion = codigoTipoTransaccion;
  }

  public boolean isReversa() {
    return reversa;
  }

  public void setReversa(boolean reversa) {
    this.reversa = reversa;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public Integer getCodigoTipoMoneda() {
    return codigoTipoMoneda;
  }

  public void setCodigoTipoMoneda(Integer codigoTipoMoneda) {
    this.codigoTipoMoneda = codigoTipoMoneda;
  }

  public Integer getVigente() {
    return vigente;
  }

  public void setVigente(Integer vigente) {
    this.vigente = vigente;
  }
}
