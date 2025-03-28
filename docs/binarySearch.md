# binarySearch Java Code Documentation

This document provides documentation for the `binarySearch` Java code, which finds the first occurrence of a target value in an integer array.

## Overview

The `binarySearch` class contains a method, `find_first_ocurrence`, that takes an integer array and a target integer as input, and returns the index of the first occurrence of the target value in the array. If the target value is not found, it returns -1.

## Class: `binarySearch`

### Author

Franco Bernardele

### Usage Example

```java
package binarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 3, 3, 3, 3, 6, 10, 10, 10, 100};
        int[] arreglo2 = {2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println(find_first_ocurrence(arreglo1, 3)); // Output: 1
        System.out.println(find_first_ocurrence(arreglo2, 6)); // Output: -1
    }

    public static int find_first_ocurrence(int[] arreglo, int target) {
        // ... (find_first_ocurrence method implementation)
    }
}