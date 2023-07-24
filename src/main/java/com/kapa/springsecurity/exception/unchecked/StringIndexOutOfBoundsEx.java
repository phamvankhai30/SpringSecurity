package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:50 24/7/2023
* @update:
* @description: The StringIndexOutOfBoundsEx class represents a custom unchecked exception
*               that is used for string index out of bounds errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an StringIndexOutOfBoundsEx
* } catch (StringIndexOutOfBoundsException ex) {
*       throw new StringIndexOutOfBoundsEx(ex.getMessage);
* }
*/
public class StringIndexOutOfBoundsEx extends  IndexOutOfBoundsEx{
    public StringIndexOutOfBoundsEx(String message){
        super(message);
    }
}
