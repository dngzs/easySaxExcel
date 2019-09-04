package com.best.excel.sax;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.InputStream;

/**
 * @author dngzs
 * @date 2019-09-04 17:51
 */
public class Demo {

    public static void main(String[] args) throws Exception{
        InputStream inputStream = Demo.class.getClassLoader().getResourceAsStream("demo.xlsx");
        OPCPackage pkg = OPCPackage.open(inputStream);
        XSSFReader xssfReader = new XSSFReader(pkg);
        SharedStringsTable sharedStringsTable = xssfReader.getSharedStringsTable();
        int i = 1;
    }

}
