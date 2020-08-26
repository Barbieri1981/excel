package com.excel.service;

import com.excel.constantes.Constantes;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellUtil;

public class ExcelHelper {

  public static void registrosVisa(Workbook workbook, String[] titulos) {

    Sheet sheetVisa = workbook.createSheet(Constantes.VISA);
    CellStyle style = workbook.createCellStyle();
    style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    DataFormat format = workbook.createDataFormat();
    Row row = sheetVisa.createRow(1);
    Cell cell = row.createCell(1);
    cell.setCellValue(Constantes.VISA);
    cell.setCellStyle(style);
    CellUtil.setAlignment(cell, HorizontalAlignment.CENTER);
    sheetVisa.addMergedRegion(new CellRangeAddress(1, 1, 1, 8));

    Row headerRow = sheetVisa.createRow(2);
    cabeceras(titulos, headerRow, workbook);
    int index = 3;
  }

  public static void cabeceras(String[] titulos, Row headerRow, Workbook workbook) {
    CellStyle style = workbook.createCellStyle();

    Cell cell;
    for (int col = 0; col < titulos.length; col++) {
      cell = headerRow.createCell(col);
      style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
      style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
      cell.setCellValue(titulos[col]);
      cell.setCellStyle(style);
    }
  }
}
