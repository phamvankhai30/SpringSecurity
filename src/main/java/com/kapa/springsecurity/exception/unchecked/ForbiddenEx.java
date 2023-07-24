package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:42 24/7/2023
* @update:
* @description: The ForbiddenEx class represents a custom unchecked exception
*               that is used to indicate forbidden access or operation errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an ForbiddenEx
* } catch (ForbiddenException ex) {
*       throw new ForbiddenEx(ex.getMessage);
* }
*/
public class ForbiddenEx extends RuntimeException {
    public ForbiddenEx(String message) {
        super(message);
    }
}
