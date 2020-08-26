package com.excel.controller;

import com.excel.dto.GenerarDocumentoContableRequestDTO;
import com.excel.service.DocumentoContableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Api
@RestController
public class DocumentoContableController {

  private DocumentoContableService service;

  public DocumentoContableController(final DocumentoContableService service) {
    this.service = service;
  }

  @ApiOperation("Metodo encargado de generar un archivo contable")
  @PostMapping(value = "/generar/excel", produces = MediaType.APPLICATION_JSON_VALUE)
  public void generarArchivoContable(
      final @RequestBody GenerarDocumentoContableRequestDTO generarDocumentoContableRequestDTO)
      throws IOException {
    service.generarArchivo(generarDocumentoContableRequestDTO);
  }
}
