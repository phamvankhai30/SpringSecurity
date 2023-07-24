package com.kapa.springsecurity.exception;

import com.kapa.springsecurity.enums.StatusExceptionEnum;
import com.kapa.springsecurity.exception.checked.FileNotFoundEx;
import com.kapa.springsecurity.exception.checked.IOEx;
import com.kapa.springsecurity.exception.checked.InterruptedEx;
import com.kapa.springsecurity.exception.checked.SQLEx;
import com.kapa.springsecurity.exception.interfaces.ICheckedExceptionHandler;
import com.kapa.springsecurity.model.dto.ExceptionDto;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class CheckedExceptionHandler implements ICheckedExceptionHandler {

    @Autowired
    private ExceptionDto exceptionDto;

    @Override
    @ExceptionHandler(FileNotFoundEx.class)
    public ResponseEntity<ExceptionDto> handleFileNotFoundException(@NotNull FileNotFoundEx ex, @NotNull WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.FILE_NOT_FOUND_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.FILE_NOT_FOUND_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.FILE_NOT_FOUND_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(InterruptedEx.class)
    public ResponseEntity<ExceptionDto> handleInterruptedException(InterruptedEx ex, WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.INTERRUPTED_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.INTERRUPTED_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.INTERRUPTED_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(IOEx.class)
    public ResponseEntity<ExceptionDto> handleIOException(IOEx ex, WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.IO_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.IO_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.IO_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(SQLEx.class)
    public ResponseEntity<ExceptionDto> handleSQLException(SQLEx ex, WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.SQL_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.SQL_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.SQL_EXCEPTION.getValue()).body(exceptionDto);
    }
}
