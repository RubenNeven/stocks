import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelMain {
    public static void main(String[] args) throws IOException {
        ExcelMain excelMain = new ExcelMain();
        excelMain.createAndSaveExcel();
    }

    private void createAndSaveExcel() throws IOException {
        Workbook xlsxWorkbook = new XSSFWorkbook();
        Sheet sheet = xlsxWorkbook.createSheet("Test");
        Row row = sheet.createRow(0);

        row.createCell(0).setCellValue("Header 1");
        row.createCell(1).setCellValue("Header 2");
        row.createCell(2).setCellValue("Header 3");

        Row row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("Value 1");
        row2.createCell(1).setCellValue("Value 2");
        row2.createCell(2).setCellValue("Value 3");

        xlsxWorkbook.write(new FileOutputStream("C:\\Users\\Ruben\\Downloads\\ExcelSample.xlsx"));
        System.out.println("Excel created succesfully");
    }
}
