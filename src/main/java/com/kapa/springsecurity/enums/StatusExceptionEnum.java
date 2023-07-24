package com.kapa.springsecurity.enums;
import lombok.Getter;
/**
 * @author: KhaiPV
 * @email: khaipham30it@gmail.com
 * @since: 09:58 24/7/2023
 * @update:
 * @description: StatusExceptionEnum class is used to define the status exception
 */
@Getter
public enum StatusExceptionEnum {
    /**
     * Custom Exception
     */
    CUSTOM_EXCEPTION(999,"This is Custom Exception. Maybe you haven't set the error",
            "This is error details. Maybe you haven't set error detail"),

    /**
     * Checked Exception
     */
    FILE_NOT_FOUND_EXCEPTION(500, "File Not Found Exception"),
    INTERRUPTED_EXCEPTION(500,"Interrupted Exception"),
    IO_EXCEPTION(500,"IO Exception"),
    SQL_EXCEPTION(500,"SQL Exception"),

    /**
     * Unchecked Exception
     */
    ILLEGAL_ARGUMENT_EXCEPTION(400, "Illegal Argument Exception"),
    NUMBER_FORMAT_EXCEPTION(400,"Number Format, Exception"),
    NOT_FOUND_EXCEPTION(404, "Not Found Exception"),

    ARITHMETIC_EXCEPTION(500,"Arithmetic Exception"),
    INDEX_OUT_OF_BOUNDS_EXCEPTION(500,"Index Out Of Bounds Exception"),
    ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION(500, "Array Index Out Of Bounds Exception"),
    CLASS_CAST_EXCEPTION(500,"Class Cass Exception"),
    ILLEGAL_STATE_EXCEPTION(500, "Illegal State Exception"),
    NEGATIVE_ARRAY_SIZE_EXCEPTION(500,"Negative Array Size Exception"),
    NO_SUCH_ELEMENT_EXCEPTION(500,"No Such Element Exception"),
    NULL_POINTER_EXCEPTION(500,"Null Pointer Exception"),
    StringIndexOutOfBoundsEx(500,"String Index Out Of Bounds Exception"),
    UNSUPPORTED_OPERATION_EXCEPTION(500,"Unsupported Operation Exception");

    /**
     * Constructor Enum
     */
    private final int value;
    private final String reasonPhrase;
    private final String message;

    StatusExceptionEnum(int value, String reasonPhrase){
        this.value = value;
        this.reasonPhrase = reasonPhrase;
        this.message = null;
    }
    StatusExceptionEnum(int value, String reasonPhrase, String message){
        this.value = value;
        this.reasonPhrase = reasonPhrase;
        this.message = message;
    }

}
