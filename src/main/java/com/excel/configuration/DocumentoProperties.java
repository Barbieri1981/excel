package com.excel.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "documentos")
@Data
@Component
public class DocumentoProperties {

    private  TarjetaCreditoProperties tarjetaCredito = new TarjetaCreditoProperties();
    private TarjetaDebitoProperties tarjetaDebito = new TarjetaDebitoProperties();

    @Data
    public static class TarjetaCreditoProperties {
        private String nombre;
        private String extension;
        private String ruta;
        private String[] titulos;
        private String glosa;
        private String vigente;
        private String reversa;
        private String abono;
        private String sucursal;
        private int moneda;
        private String cuentaFraude;
        private String cuentaNoFraude;

    }
    @Data
    public static class TarjetaDebitoProperties {
        private CodigosProperties codigos = new CodigosProperties();
        private LeyFraudeProperties leyFraude = new LeyFraudeProperties();
        private NoLeyFraudeProperties noLeyFraude = new NoLeyFraudeProperties();
        private String nombre;
        private String extension;
        private String ruta;

        @Data
        public static class CodigosProperties{
           private String usuario;
           private String reversa;
           private String abono;
           private int moneda;
           private String entidad;
           private String linea;
           private String sequencia;
           private int giros;
           private int compras;
        }
        @Data
        public static class LeyFraudeProperties{
            private String tarjetaDebito;
            private String otros;
            private String cuentaCosto;

        }
        @Data
        public static  class NoLeyFraudeProperties{
            private String tarjetaDebito;
            private String giros;
            private String otros;
        }
    }


}
