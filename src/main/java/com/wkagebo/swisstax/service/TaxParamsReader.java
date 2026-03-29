package com.wkagebo.swisstax.service;

import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Service
public class TaxParamsReader {

    public int getGrossIncome(String filePath) {
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);
            return Integer.parseInt(properties.getProperty("grossIncome"));
        } catch (IOException e ) {
            System.err.println("Failed to read properties file: " + e.getMessage());
        }
        return 0;
    }

}
