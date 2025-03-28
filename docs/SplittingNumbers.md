# SplittingNumbers Java Code Documentation

This document provides documentation for the `SplittingNumbers` Java code, which splits an integer into its place value components.

## Overview

The `SplittingNumbers` class contains a method, `splittingNumbers`, that takes an integer as input and returns an `Integer` array containing the place value components of the input integer. For example, the integer -452 will be split into [-400, -50, -2].

## Class: `SplittingNumbers`

### Author

Franco Bernardele

### Usage Example

```java
package SplittingNumbers;

import java.util.Arrays;

public class SplittingNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(splittingNumbers(-452))); // Output: [-400, -50, -2]
    }

    public static Integer[] splittingNumbers(int n) {
        // ... (splittingNumbers method implementation)
    }
}