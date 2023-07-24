package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:45 24/7/2023
* @update:
* @description: The IndexOutOfBoundsEx class represents a custom unchecked exception that is used for index out of bounds errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an IndexOutOfBoundsEx
* } catch (IndexOutOfBoundsException ex) {
*       throw new IndexOutOfBoundsEx(ex.getMessage);
* }
*/
public class IndexOutOfBoundsEx extends RuntimeException{
    public IndexOutOfBoundsEx(String message){
        super(message);
    }
}


