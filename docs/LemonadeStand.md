# LemonadeStand Java Code Documentation

This document provides documentation for the `LemonadeStand` Java code, which determines if a lemonade stand can provide correct change to each customer.

## Overview

The `LemonadeStand` class contains a method, `lemonade`, that takes an array of integers representing the bills paid by customers and determines if the lemonade stand can provide correct change to each customer. The lemonade stand sells lemonade for $5, and customers pay with $5, $10, or $20 bills.

## Class: `LemonadeStand`

### Author

Franco Bernardele

### Usage Example

```java
public class LemonadeStand {
    public static void main(String[] args) {
        int[] numero = {5, 5, 10, 20, 5, 10};
        System.out.println(lemonade(numero)); // Output: true
    }

    public static boolean lemonade(int[] bills) {
        // ... (lemonade method implementation)
    }
}