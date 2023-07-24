package com.kapa.springsecurity.exception.interfaces;

import com.kapa.springsecurity.exception.unchecked.*;
import com.kapa.springsecurity.model.dto.ExceptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
/**
 * @author: KhaiPV
 * @email: khaipham30it@gmail.com
 * @since: 10:56 24/7/2023
 * @update:
 * @description: The IUncheckedExceptionHandler interface defines methods for handling  unchecked exceptions.
 */
@SuppressWarnings("unused")
public interface IUncheckedExceptionHandler {
    ResponseEntity<ExceptionDto> handleGlobalException(Exception ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleCustomException(CustomException ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleArithmeticException(ArithmeticEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleBadRequestException(BadRequestEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleClassCastException(ClassCastEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleForbiddenException(ForbiddenEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleIllegalArgumentException(IllegalArgumentEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleIllegalStateException(IllegalStateEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleIndexOutOfBoundsException(IndexOutOfBoundsEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleNegativeArraySizeException(NegativeArraySizeEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleNoSuchElementException(NoSuchElementEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleNotFoundException(NotFoundEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleNullPointerException(NullPointerEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleNumberFormatException(NumberFormatEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleStringIndexOutOfBoundsException(StringIndexOutOfBoundsEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleUnsupportedOperationException(UnsupportedOperationEx ex, WebRequest request);

}
