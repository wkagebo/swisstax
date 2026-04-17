package com.wkagebo.swisstax.model;

public record TaxParams(
        int grossIncome,
        int age,
        int taxYear,
        String municipality,
        MaritalStatus maritalStatus,
        Religion religion,
        int children,
        int fortune
        ) {}
