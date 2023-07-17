package com.kapa.springsecurity.exception;

import com.kapa.springsecurity.model.dto.ExceptionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalException {
    @Autowired
    private ExceptionDto exceptionDto;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDto> handleGlobalException(Exception ex, WebRequest request){
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .setError(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.internalServerError().body(exceptionDto);
    }

}
