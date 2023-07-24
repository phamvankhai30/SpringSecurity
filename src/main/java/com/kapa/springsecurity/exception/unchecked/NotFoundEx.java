package com.kapa.springsecurity.exception.unchecked;
/**
* @author: KhaiPV
* @email: khaipham30it@gmail.com
* @since: 10:47 24/7/2023
* @update:
* @description: The NotFoundEx class represents a custom unchecked exception that is used for resource not found errors.
*<p>
* Example usage:
* try {
*     // Some code that may throw an NotFoundEx
* } catch (NotFoundException ex) {
*       throw new NotFoundEx(ex.getMessage);
* }
*/
public class NotFoundEx extends RuntimeException{

    public NotFoundEx(String message){
        super(message);
    }

}
