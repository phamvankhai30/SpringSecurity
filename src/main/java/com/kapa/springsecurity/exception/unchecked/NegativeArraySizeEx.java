package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:46 24/7/2023
* @update:
* @description:
*<p>
* Example usage:The NegativeArraySizeEx class represents a custom unchecked exception that is used for negative array size errors.
* try {
*     // Some code that may throw an NegativeArraySizeEx
* } catch (NegativeArraySizeException ex) {
*       throw new NegativeArraySizeEx(ex.getMessage);
* }
*/
public class NegativeArraySizeEx extends RuntimeException {
    public NegativeArraySizeEx(String message) {
        super(message);
    }
}
