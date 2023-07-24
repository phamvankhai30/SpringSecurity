package com.kapa.springsecurity.exception;

import com.kapa.springsecurity.enums.StatusExceptionEnum;
import com.kapa.springsecurity.exception.interfaces.IUncheckedExceptionHandler;
import com.kapa.springsecurity.exception.unchecked.*;
import com.kapa.springsecurity.model.dto.ExceptionDto;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class UncheckedExceptionHandler implements IUncheckedExceptionHandler {
    @Autowired
    private ExceptionDto exceptionDto;

    @Override
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDto> handleGlobalException(@NotNull Exception ex, @NotNull WebRequest request){
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .setError(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.internalServerError().body(exceptionDto);
    }

    @Override
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ExceptionDto> handleCustomException(@NotNull CustomException ex, WebRequest request) {
        LocalDateTime localDateTime = ex.getExceptionDto().getTimestamp() == null ? LocalDateTime.now() : ex.getExceptionDto().getTimestamp();
        int statusCode = (ex.getExceptionDto().getStatus() == 0) ? StatusExceptionEnum.CUSTOM_EXCEPTION.getValue() : ex.getExceptionDto().getStatus();
        String error = (ex.getExceptionDto().getError() == null) ? StatusExceptionEnum.CUSTOM_EXCEPTION.getReasonPhrase() : ex.getExceptionDto().getError();
        String message = (ex.getExceptionDto().getMessage() == null) ? StatusExceptionEnum.CUSTOM_EXCEPTION.getMessage() : ex.getExceptionDto().getMessage();
        String path = (ex.getExceptionDto().getPath() == null) ? request.getDescription(false) : ex.getExceptionDto().getPath();

        exceptionDto
                .setTimestamp(localDateTime)
                .setStatus(statusCode)
                .setError(error)
                .setMessage(message)
                .setPath(path);

        return ResponseEntity.status(statusCode).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(ArithmeticEx.class)
    public ResponseEntity<ExceptionDto> handleArithmeticException(@NotNull ArithmeticEx ex, @NotNull WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.ARITHMETIC_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.ARITHMETIC_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.ARITHMETIC_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(ArrayIndexOutOfBoundsEx.class)
    public ResponseEntity<ExceptionDto> handleArrayIndexOutOfBoundsException(@NotNull ArrayIndexOutOfBoundsEx ex, @NotNull WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(BadRequestEx.class)
    public ResponseEntity<ExceptionDto> handleBadRequestException(BadRequestEx ex, WebRequest request){
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(HttpStatus.BAD_REQUEST.value())
                .setError(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.badRequest().body(exceptionDto);
    }

    @Override
    @ExceptionHandler(ClassCastEx.class)
    public ResponseEntity<ExceptionDto> handleClassCastException(ClassCastEx ex, WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.CLASS_CAST_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.CLASS_CAST_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.CLASS_CAST_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(ForbiddenEx.class)
    public ResponseEntity<ExceptionDto> handleForbiddenException(ForbiddenEx ex, WebRequest request){
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(HttpStatus.FORBIDDEN.value())
                .setError(HttpStatus.FORBIDDEN.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(HttpStatus.FORBIDDEN.value()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(IllegalArgumentEx.class)
    public ResponseEntity<ExceptionDto> handleIllegalArgumentException(IllegalArgumentEx ex, WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.ILLEGAL_ARGUMENT_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.ILLEGAL_ARGUMENT_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.ILLEGAL_ARGUMENT_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(IllegalStateEx.class)
    public ResponseEntity<ExceptionDto> handleIllegalStateException(@NotNull IllegalStateEx ex, @NotNull WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.ILLEGAL_STATE_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.ILLEGAL_STATE_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.ILLEGAL_STATE_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(IndexOutOfBoundsEx.class)
    public ResponseEntity<ExceptionDto> handleIndexOutOfBoundsException(IndexOutOfBoundsEx ex, WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.INDEX_OUT_OF_BOUNDS_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.INDEX_OUT_OF_BOUNDS_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.INDEX_OUT_OF_BOUNDS_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(NegativeArraySizeEx.class)
    public ResponseEntity<ExceptionDto> handleNegativeArraySizeException(NegativeArraySizeEx ex, WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.ILLEGAL_STATE_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.ILLEGAL_STATE_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.ILLEGAL_STATE_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(NoSuchElementEx.class)
    public ResponseEntity<ExceptionDto> handleNoSuchElementException(NoSuchElementEx ex, WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.NO_SUCH_ELEMENT_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.NO_SUCH_ELEMENT_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.NO_SUCH_ELEMENT_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(NotFoundEx.class)
    public ResponseEntity<ExceptionDto> handleNotFoundException(NotFoundEx ex, WebRequest request){
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.NOT_FOUND_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.NOT_FOUND_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.NOT_FOUND_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(StringIndexOutOfBoundsEx.class)
    public ResponseEntity<ExceptionDto> handleStringIndexOutOfBoundsException(StringIndexOutOfBoundsEx ex, WebRequest request){
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.StringIndexOutOfBoundsEx.getValue())
                .setError(StatusExceptionEnum.StringIndexOutOfBoundsEx.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.StringIndexOutOfBoundsEx.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(NullPointerEx.class)
    public ResponseEntity<ExceptionDto> handleNullPointerException(@NotNull NullPointerEx ex, @NotNull WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.NULL_POINTER_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.NULL_POINTER_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.NULL_POINTER_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(NumberFormatEx.class)
    public ResponseEntity<ExceptionDto> handleNumberFormatException(@NotNull NumberFormatEx ex, @NotNull WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.NUMBER_FORMAT_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.NUMBER_FORMAT_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.NUMBER_FORMAT_EXCEPTION.getValue()).body(exceptionDto);
    }

    @Override
    @ExceptionHandler(UnsupportedOperationEx.class)
    public ResponseEntity<ExceptionDto> handleUnsupportedOperationException(UnsupportedOperationEx ex, WebRequest request) {
        exceptionDto
                .setTimestamp(LocalDateTime.now())
                .setStatus(StatusExceptionEnum.UNSUPPORTED_OPERATION_EXCEPTION.getValue())
                .setError(StatusExceptionEnum.UNSUPPORTED_OPERATION_EXCEPTION.getReasonPhrase())
                .setMessage(ex.getMessage())
                .setPath(request.getDescription(false));

        return ResponseEntity.status(StatusExceptionEnum.UNSUPPORTED_OPERATION_EXCEPTION.getValue()).body(exceptionDto);
    }
}
