package com.antra.evaluation.reporting_system.enums;

import lombok.Getter;

@Getter
public enum ErrorEnum {



    FILE_NOT_EXIST(1, "Excel FIle Error: This file doesnt`t exist"),

    INPUT_FORMAT_ERROR(10, "Excel Data Error: Input data format has error, headers and data must exist and in same length. " +
            "For multi-sheet request, the field for split by cannot be null"),

    PARAM_ERROR(11, "Excel Data Error: Error with parameter type. Data types are inconsistent"),

    NO_SHEET_DEFINED(12, "Excel Data Error: no sheet is defined"),

    NO_SHEET_NAME( 13, "Excel Data Error: Sheet name is missing"),

    ERROR_WITH_DATA_LENGTH(14,"Excel Data Error: Sheet data has difference length than header number"),

    DOWNLOAD_ERROR(31, "IO Error: File download failed"),

    UPLOAD_ERROR(32, "IO Error: File save failed"),

    ;


    private Integer code;

    private String message;

    ErrorEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
