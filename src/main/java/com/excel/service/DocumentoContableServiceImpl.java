package com.excel.service;

import com.excel.configuration.DocumentoProperties;
import com.excel.dto.GenerarDocumentoContableRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;

@Slf4j
@Service
public class DocumentoContableServiceImpl implements DocumentoContableService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DocumentoContableService.class);

    private DocumentoProperties documentoProperties;

    public DocumentoContableServiceImpl(DocumentoProperties documentoProperties) {
        this.documentoProperties = documentoProperties;
    }

    @Override
    public void generarArchivo(GenerarDocumentoContableRequestDTO requestDTO) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;

        try {
            String[] titulos = {"Volvo", "BMW", "Ford", "Mazda"};
            ExcelHelper.registrosVisa(workbook, titulos);

            File currDir = new File(".");
            String path = currDir.getAbsolutePath();
            String fileLocation = path + "test.xlsx";

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
