package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:44 24/7/2023
* @update:
* @description: The IllegalStateEx class represents a custom unchecked exception that is used for illegal state errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an IllegalStateEx
* } catch (IllegalStateException ex) {
*       throw new IllegalStateEx(ex.getMessage);
* }
*/
public class IllegalStateEx extends RuntimeException{
    public IllegalStateEx(String message) {
        super(message);
    }
}
