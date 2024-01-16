package com.applicationapi.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Service;

//https://poi.apache.org/components/spreadsheet/quick-guide.html#TextExtraction
@Service
public class ExcelService {
    
    public List<?> readExcel(String excelFileName)  {
        List<Object> result= new ArrayList<>();
        ExcelExtractor extractor = null;
        HSSFWorkbook wb = null;
        int index = 0;
        try (InputStream inp = new FileInputStream(excelFileName)) {
            wb = new HSSFWorkbook(new POIFSFileSystem(inp));
            HSSFSheet sheet = wb.getSheetAt(0);
              for (Row row : sheet) {
                Object rowDatas = null;
                int headerIndex = 0;
                for (Cell cell : row) {
                    // Do something here
                    String cellValue = "";
                    CellType cellType = cell.getCellType();
                    
                    switch(cellType) {
                        case NUMERIC:
                            cellValue = String.valueOf(cell);
                            break;
                        default:
                            cellValue = cell.toString();
                    }
                    if (cellValue == null) {
                        cellValue = "";
                    }
                    if (index == 0) {
                        if (rowDatas == null) {
                            rowDatas = new ArrayList<>();
                        }
                        ((List) rowDatas).add(cellValue);

                    } else {
                        if (rowDatas == null) {
                            headerIndex = 0;
                            rowDatas = new HashMap<String, String>();
                        }
                        String headerName = ((List<String>) result.get(0)).get(headerIndex);
                        ((Map) rowDatas).put(headerName ,cell);
                        headerIndex++;
                    }
                }
                result.add(rowDatas);
                rowDatas = null;
                index++;
            }
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
        return result;
    }
}
