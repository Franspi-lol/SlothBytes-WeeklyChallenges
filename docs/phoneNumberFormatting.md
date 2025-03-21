# FormatearNumero Java Code Documentation

This document provides documentation for the `FormatearNumero` Java code, which formats an integer array representing a phone number into a string.

## Overview

The `FormatearNumero` class contains a method, `devolverNro`, that takes an integer array representing a phone number and returns a formatted string with parentheses, spaces, and hyphens. This is commonly used for displaying phone numbers in a user-friendly format.

## Class: `FormatearNumero`

### Author

Franco Bernardele (Franspi-lol)

### Usage Example

```java
public class FormatearNumero {
    public static void main(String[] args) {
        int[] phoneNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String formattedNumber = devolverNro(phoneNumber);
        System.out.println(formattedNumber); // Output: (123) 456-7890
    }

    static String devolverNro(int[] numero) {
        // ... (devolverNro method implementation)
    }
}
