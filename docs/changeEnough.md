# changeEnough Java Code Documentation

This document provides documentation for the `changeEnough` Java code, which determines if a given amount of change is enough to pay a specified amount.

## Overview

The `changeEnough` class contains a method, `changeEnough`, that takes an array of integers representing the number of quarters, dimes, nickels, and pennies, and a float representing the amount to pay. It returns `true` if the change is enough to pay the amount, and `false` otherwise.

## Class: `changeEnough`

### Author

Franco Bernardele

### Usage Example

```java
package changeEnough;

public class changeEnough {
    public static void main(String[] args) {
        int[] cambio = {30, 40, 20, 5};
        System.out.println(changeEnough(cambio, 12.55F)); // Output: true
    }

    public static boolean changeEnough(int[] cambio, float aPagar) {
        // ... (changeEnough method implementation)
    }
}