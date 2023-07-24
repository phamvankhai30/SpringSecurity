package com.kapa.springsecurity.exception.interfaces;

import com.kapa.springsecurity.exception.checked.FileNotFoundEx;
import com.kapa.springsecurity.exception.checked.IOEx;
import com.kapa.springsecurity.exception.checked.InterruptedEx;
import com.kapa.springsecurity.exception.checked.SQLEx;
import com.kapa.springsecurity.model.dto.ExceptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
/**
 * @author: KhaiPV
 * @email: khaipham30it@gmail.com
 * @since: 10:53 24/7/2023
 * @update:
 * @description: The ICheckedExceptionHandler interface defines methods for handling  checked exceptions.
 */
@SuppressWarnings("unused")
public interface ICheckedExceptionHandler {

    ResponseEntity<ExceptionDto> handleFileNotFoundException(FileNotFoundEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleInterruptedException(InterruptedEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleIOException(IOEx ex, WebRequest request);
    ResponseEntity<ExceptionDto> handleSQLException(SQLEx ex, WebRequest request);
}
