package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:43 24/7/2023
* @update:
* @description: The IllegalArgumentEx class represents a custom unchecked exception that is used for illegal argument errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an IllegalArgumentEx
* } catch (IllegalArgumentException ex) {
*       throw new IllegalArgumentEx(ex.getMessage);
* }
*/
public class IllegalArgumentEx extends RuntimeException{
    public IllegalArgumentEx(String message) {
        super(message);
    }
}
