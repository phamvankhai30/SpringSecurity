package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:30 24/7/2023
* @update:
* @description: The ArithmeticEx class represents a custom unchecked exception that is used for arithmetic-related errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an ArithmeticEx
* } catch (ArithmeticException ex) {
*       throw new ArithmeticEx(ex.getMessage);
* }
*/
public class ArithmeticEx extends RuntimeException{
    public ArithmeticEx(String message) {
        super(message);
    }
}
