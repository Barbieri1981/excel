package com.excel.service;

import com.excel.dto.GenerarDocumentoContableRequestDTO;

import java.io.IOException;

public interface DocumentoContableService {

  void generarArchivo(final GenerarDocumentoContableRequestDTO requestDTO) throws IOException;
}
