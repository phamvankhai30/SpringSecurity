package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:32 24/7/2023
* @update:
* @description: The ClassCastEx class represents a custom unchecked exception that is used for class cast errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an ClassCastEx
* } catch (ClassCastException ex) {
*       throw new ClassCastEx(ex.getMessage);
* }
*/
public class ClassCastEx extends RuntimeException {
    public ClassCastEx(String message){
        super(message);
    }
}
