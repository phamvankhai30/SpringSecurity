package com.kapa.springsecurity.exception;

import com.kapa.springsecurity.model.dto.ExceptionDto;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {
    private ExceptionDto exceptionDto;

    public CustomException(ExceptionDto exceptionDto) {
        super(exceptionDto.getMessage());
        this.exceptionDto = exceptionDto;
    }

    public ExceptionDto getExceptionDto() {
        return exceptionDto;
    }
}
