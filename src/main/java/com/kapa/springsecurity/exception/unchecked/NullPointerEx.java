package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:48 24/7/2023
* @update:
* @description: The NullPointerEx class represents a custom unchecked exception that is used for null pointer errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an NullPointerEx
* } catch (NullPointerException ex) {
*       throw new NullPointerEx(ex.getMessage);
* }
*/
public class NullPointerEx extends RuntimeException{
    public NullPointerEx(String message){
        super(message);
    }
}
