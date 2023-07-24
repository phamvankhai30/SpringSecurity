package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:51 24/7/2023
* @update:
* @description: The UnsupportedOperationEx class represents a custom unchecked exception
*               that is used for unsupported operation errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an UnsupportedOperationEx
* } catch (UnsupportedOperationException ex) {
*       throw new UnsupportedOperationEx(ex.getMessage);
* }
*/
public class UnsupportedOperationEx extends RuntimeException {
    public UnsupportedOperationEx(String message) {
        super(message);
    }
}
