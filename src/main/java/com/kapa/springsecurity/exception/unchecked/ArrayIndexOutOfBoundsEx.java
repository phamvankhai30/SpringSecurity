package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:31 24/7/2023
* @update:
* @description: The ArrayIndexOutOfBoundsEx class represents a custom checked exception that is used for array index out of bounds errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an ArrayIndexOutOfBoundsEx
* } catch (ArrayIndexOutOfBoundsException ex) {
*       throw new ArrayIndexOutOfBoundsEx(ex.getMessage);
* }
*/
public class ArrayIndexOutOfBoundsEx extends IndexOutOfBoundsEx{
    public ArrayIndexOutOfBoundsEx(String message){
        super(message);
    }
}
