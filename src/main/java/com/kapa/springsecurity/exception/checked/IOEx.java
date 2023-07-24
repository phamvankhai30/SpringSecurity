package com.kapa.springsecurity.exception.checked;
/**
 * @author: KhaiPV
 * @email: khaipham30it@gmail.com
 * @since: 10:18 24/7/2023
 * @update:
 * @description: The IOEx class represents a custom checked exception that is used for Input/Output (IO) related errors.
 * <p>
 * Example usage:
 * try {
 *     // Some code that may throw a IOException
 * } catch (IOException ex) {
 *     throw new IOEx(ex.getMessage());
 * }
 */
public class IOEx extends Exception{
    public IOEx(String message){
        super(message);
    }
}
