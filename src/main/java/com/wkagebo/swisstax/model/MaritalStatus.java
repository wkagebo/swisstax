package com.wkagebo.swisstax.model;

public enum MaritalStatus {
    SINGLE(1),
    MARRIED(2),
    COHABITING(3),
    CIVIL_PARTNERSHIP(4);

    private final int apiId;

    MaritalStatus(int apiId) {
        this.apiId = apiId;
    }

    public int getApiId() {
        return apiId;
    }
}
