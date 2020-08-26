package com.excel.service;

import com.excel.dto.EstructuraBaseExcelDTO;
import com.excel.dto.GenerarDocumentoContableRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Slf4j
@Service
public class DocumentoContableServiceImpl implements DocumentoContableService {

  private static final Logger LOGGER = LoggerFactory.getLogger(DocumentoContableService.class);
  private EstructuraBaseExcelDTO estructuraBaseExcelDTO;

  public DocumentoContableServiceImpl(final EstructuraBaseExcelDTO estructuraBaseExcelDTO) {
    this.estructuraBaseExcelDTO = estructuraBaseExcelDTO;
  }

  @Override
  public void generarArchivo(final GenerarDocumentoContableRequestDTO requestDTO)
      throws IOException {
    Workbook workbook = new XSSFWorkbook();
    ByteArrayOutputStream byteArrayOutputStream;
    ByteArrayInputStream byteArrayInputStream;

    try {
      String[] titulos = estructuraBaseExcelDTO.getDevolucionSaldoAFavor().getTitulos();

      ExcelHelper.registrosVisa(workbook, titulos);

      File currDir = new File(".");
      String path = currDir.getAbsolutePath();
      String fileLocation = path + "" + "test.xlsx";

      FileOutputStream outputStream = new FileOutputStream(fileLocation);
      workbook.write(outputStream);

      byteArrayOutputStream = new ByteArrayOutputStream();
      workbook.write(byteArrayOutputStream);
      byteArrayOutputStream.write(byteArrayOutputStream.toString().getBytes());
      byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

      byteArrayOutputStream.close();
      byteArrayInputStream.close();

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (workbook != null) {
        workbook.close();
      }
    }
  }
}
