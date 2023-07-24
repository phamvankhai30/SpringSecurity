package com.kapa.springsecurity.exception.unchecked;

import com.kapa.springsecurity.model.dto.ExceptionDto;
import org.jetbrains.annotations.NotNull;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:36 24/7/2023
* @update:
* @description: The CustomException class represents a custom exception
*<p>
* Example usage:
* try {
*     // Some code that may throw an CustomException
* } catch (CustomException ex) {
*       throw new CustomException(new ExceptionDTO().setStatus(404).setError("Not Found User").setMessage(ex.getMessage));
* }
*/
public class CustomException extends RuntimeException {
    private ExceptionDto exceptionDto;

    public CustomException(@NotNull ExceptionDto exceptionDto) {
        super(exceptionDto.getMessage());
        this.exceptionDto = exceptionDto;
    }

    public ExceptionDto getExceptionDto() {
        return exceptionDto;
    }
}
