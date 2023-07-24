package com.kapa.springsecurity.exception.checked;
/**
 * @author: KhaiPV
 * @email: khaipham30it@gmail.com
 * @since: 10:01 24/7/2023
 * @update:
 * @description: The FileNotFoundEx class represents a custom exception that is thrown when a file or directory is not found.
 * <p>
 * Example usage:
 * try {
 *     // Some code that may throw a FileNotFoundEx
 * } catch (FileNotFoundException ex) {
 *     throw new FileNotFoundEx(ex.getMessage());
 * }
 */
public final class FileNotFoundEx extends IOEx{
    public FileNotFoundEx(String message){
        super(message);
    }

}
