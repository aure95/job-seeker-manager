package com.applicationapi.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.stereotype.Service;

//https://poi.apache.org/components/spreadsheet/quick-guide.html#TextExtraction
@Service
public class ExcelService {
    
    public Object readExcel(String excelFileName)  {

        ExcelExtractor extractor = null;
        HSSFWorkbook wb = null;
        int cpt = 0;
        try (InputStream inp = new FileInputStream(excelFileName)) {
            wb = new HSSFWorkbook(new POIFSFileSystem(inp));
            extractor = new ExcelExtractor(wb);
            extractor.setFormulasNotResults(true);
            extractor.setIncludeSheetNames(false);
            System.out.println("////////" + cpt + "///////");
            String text = extractor.getText();
            System.out.println(text);
        } 
        catch( IOException e) {
            System.out.println(e.getStackTrace());
        } finally {
            if (extractor != null) {
                try {
                    extractor.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (wb != null) {
                try {
                    wb.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
        return "OK";

    }
}
