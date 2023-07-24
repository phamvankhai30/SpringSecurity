package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:49 24/7/2023
* @update:
* @description: The NumberFormatEx class represents a custom unchecked exception that is used for number format errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an NumberFormatEx
* } catch (NumberFormatException ex) {
*       throw new NumberFormatEx(ex.getMessage);
* }
*/
public class NumberFormatEx extends IllegalArgumentEx {
    public NumberFormatEx(String message) {
        super(message);
    }
}
