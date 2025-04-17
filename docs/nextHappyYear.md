# nextHappyYear Java Code Documentation

This document provides documentation for the `nextHappyYear` Java code, which finds the next "happy year" after a given year. A happy year is defined as a year in which all of its digits are unique.

## Overview

The `nextHappyYear` class contains methods to determine the next happy year after a given year. It includes helper methods to check for repeated digits in an array and to separate the digits of an integer.

## Class: `nextHappyYear`

### Author

Franco Bernardele

### Usage Example

```java
package nextHappyYear;

public class nextHappyYear {
    public static void main(String[] args) {
        System.out.println(happyYear(1995)); // Output: 2013
    }

    public static int happyYear(int year) {
        // ... (happyYear method implementation)
    }

    public static boolean tieneValoresRepetidos(int[] array) {
        // ... (tieneValoresRepetidos method implementation)
    }

    public static int[] separarCifras(int numero) {
        // ... (separarCifras method implementation)
    }
}