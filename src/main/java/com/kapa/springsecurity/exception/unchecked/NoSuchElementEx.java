package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:46 24/7/2023
* @update:
* @description: The NoSuchElementEx class represents a custom unchecked exception that is used for no such element errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an NoSuchElementEx
* } catch (NoSuchElementException ex) {
*       throw new NoSuchElementEx(ex.getMessage);
* }
*/
public class NoSuchElementEx extends RuntimeException {
    public NoSuchElementEx(String message) {
        super(message);
    }
}
