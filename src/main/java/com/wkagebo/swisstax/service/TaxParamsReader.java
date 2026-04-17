package com.wkagebo.swisstax.service;

import com.wkagebo.swisstax.model.MaritalStatus;
import com.wkagebo.swisstax.model.Religion;
import com.wkagebo.swisstax.model.TaxParams;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Service
public class TaxParamsReader {

    public TaxParams getTaxParams(String filePath) {
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);
            int grossIncome = Integer.parseInt(properties.getProperty("grossIncome"));
            int age = Integer.parseInt(properties.getProperty("age"));
            int taxYear = Integer.parseInt(properties.getProperty("taxYear"));
            String municipality = properties.getProperty("municipality");
            MaritalStatus maritalStatus = MaritalStatus.valueOf(properties.getProperty("maritalStatus"));
            Religion religion = Religion.valueOf(properties.getProperty("confession"));
            int children = Integer.parseInt(properties.getProperty("children"));
            int fortune = Integer.parseInt(properties.getProperty("fortune"));

            return new TaxParams(
                    grossIncome,
                    age,
                    taxYear,
                    municipality,
                    maritalStatus,
                    religion,
                    children,
                    fortune
            );
        } catch (IOException e) {
            throw new RuntimeException("Failed to read properties file: " + e.getMessage());
        }
    }

}
