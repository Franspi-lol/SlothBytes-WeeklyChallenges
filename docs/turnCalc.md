# NumberConverter Java Code Documentation

This document provides documentation for the `NumberConverter` Java code, which converts numbers (both integers and strings) to custom string representations.

## Overview

The `NumberConverter` class contains two methods, `turnCalcInt` and `turnCalcString`, that convert numbers to a string representation based on a custom mapping. The mapping replaces digits with specific characters.

## Class: `NumberConverter`

### Author

Franco Bernardele (Franspi-lol)

### Usage Example

```java
import java.util.HashMap;
import java.util.Map;

public class NumberConverter {
    public static void main(String[] args) {
        System.out.println(turnCalcInt(1234567890)); // Output: OBGLSHEZI
        System.out.println(turnCalcString("1234567890")); // Output: OBGLSHEZI
    }

    public static String turnCalcInt(int num) {
        // ... (turnCalcInt method implementation)
    }

    public static String turnCalcString(String num) {
        // ... (turnCalcString method implementation)
    }
}
