package com.crossenagetask.enums;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public enum ErrorRepository {

    CSV_FILE_NOT_FOUND(1, "Csv File not found");

    private final int code;
    private final String description;

    private ErrorRepository(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }
}
