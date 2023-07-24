package com.kapa.springsecurity.exception.checked;
/**
 * @author: KhaiPV
 * @email: khaipham30it@gmail.com
 * @since: 10:21 24/7/2023
 * @update:
 * @description: The SQLEx class represents a custom checked exception that is used for SQL-related errors.
 * <p>
 * Example usage:
 * try {
 *     // Some code that may throw a SQLEx
 * } catch (SQLException ex) {
 *     throw new SQLEx(ex.getMessage());
 * }
 */
public class SQLEx extends Exception{
    public SQLEx(String message){
        super(message);
    }
}
