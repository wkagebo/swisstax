package com.wkagebo.swisstax.model;

public enum Religion {
    PROTESTANT(1),
    ROMAN_CATHOLIC(2),
    CHRISTIAN_CATHOLIC(3),
    OTHER_OR_NONE(5);

    private final int apiId;

    Religion(int apiId) {
        this.apiId = apiId;
    }

    public int getApiId() {
        return apiId;
    }
}
