package com.excel.service;


import com.excel.dto.GenerarDocumentoContableRequestDTO;

import java.io.IOException;

public interface DocumentoContableService {

    void generarArchivo(GenerarDocumentoContableRequestDTO requestDTO) throws IOException;

}
