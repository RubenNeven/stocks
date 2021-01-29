package com.excelexport.springbootexcel.export;

import com.excelexport.springbootexcel.Entity.User;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ExcelExporter {

    private XSSFWorkbook xssfWorkbook;
    private XSSFSheet xssfSheet;
    private List<User> userList;

    private void headerLine() {
        xssfSheet = xssfWorkbook.createSheet("All Users Details");
        Row row = xssfSheet.createRow(0);
        CellStyle cellStyle = xssfWorkbook.createCellStyle();
        XSSFFont font = xssfWorkbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        cellStyle.setFont(font);

        createCell(row, 0, "Id", cellStyle);
        createCell(row, 1, "Name", cellStyle);
        createCell(row, 2, "Address", cellStyle);
        createCell(row, 3, "Email", cellStyle);
        createCell(row, 4, "Record 1", cellStyle);
        createCell(row, 5, "Record 2", cellStyle);
        createCell(row, 6, "Record 3", cellStyle);
    }

    private void createCell(Row row, int countColumn, Object value, CellStyle cellStyle) {
        xssfSheet.autoSizeColumn(countColumn);
        Cell cell = row.createCell(countColumn);
        if (value instanceof Integer){
            cell.setCellValue((Double) value);
        } else if(value instanceof Boolean){
            cell.setCellValue((Double) value);
        } else {
            cell.setCellValue((Double) value);
        }
        cell.setCellStyle(cellStyle);
    }

    private void writeDataLines(){
        int rowCount = 1;
        CellStyle style = xssfWorkbook.createCellStyle();
        XSSFFont font = xssfWorkbook.createFont();
        font.setFontHeight(18);
        style.setFont(font);

        for (User user : userList){
            Row row = xssfSheet.createRow(rowCount++);
            int countColumn = 0;
            createCell(row, countColumn++, user.getUser_id(), style);
            createCell(row, countColumn++, user.getName(), style);
            createCell(row, countColumn++, user.getUser_address(), style);
            createCell(row, countColumn++, user.getUser_email(), style);
            createCell(row, countColumn++, user.getUser_record1(), style);
            createCell(row, countColumn++, user.getUser_record2(), style);
            createCell(row, countColumn++, user.getUser_record3(), style);
        }
    }

    public ExcelExporter(List<User> list){
        this.userList = list;
        xssfWorkbook = new XSSFWorkbook();
    }

    public void exportData(HttpServletResponse response) throws IOException {
        headerLine();
        writeDataLines();
        ServletOutputStream outputStream = response.getOutputStream();
        xssfWorkbook.write(outputStream);
        xssfWorkbook.close();
        outputStream.close();
    }
}
