package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:32 24/7/2023
* @update:
* @description: The BadRequestEx class represents a custom unchecked exception that is used for bad request errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an BadRequestEx
* } catch (BadRequestException ex) {
*       throw new BadRequestEx(ex.getMessage);
* }
*/
public class BadRequestEx extends RuntimeException{
    public BadRequestEx(String message) {
        super(message);
    }
}
