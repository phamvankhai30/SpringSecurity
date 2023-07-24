package com.kapa.springsecurity.exception.checked;
/**
 * @author: KhaiPV
 * @email: khaipham30it@gmail.com
 * @since: 10:16 24/7/2023
 * @update:
 * @description: The InterruptedEx class represents a custom checked exception
 *               that is thrown when a thread is interrupted while waiting or sleeping.
 * <p>
 * Example usage:
 * try {
 *     // Some code that may throw a InterruptedEx
 * } catch (InterruptedException ex) {
 *     throw new InterruptedEx(ex.getMessage());
 * }
 */
public class InterruptedEx extends Exception {
    public InterruptedEx(String message){
        super(message);
    }
}
