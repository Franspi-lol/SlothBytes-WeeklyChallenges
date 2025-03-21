# bridgeShuffle Java Code Documentation

This document provides documentation for the `bridgeShuffle` Java code, which implements a bridge shuffle algorithm for interleaving elements from two arrays.

## Overview

The `bridgeShuffle` class provides a method to perform a "bridge shuffle" on two input arrays. The bridge shuffle interleaves the elements of the two input arrays, adding elements from each array alternately to a new `ArrayList`. If one array is shorter than the other, the remaining elements of the longer array are appended to the end of the `ArrayList`.

## Class: `bridgeShuffle`

### Author

Franco Bernardele (Franspi-lol)

### Usage Example

```java
import java.util.ArrayList;

public class bridgeShuffle {
    public static void main(String[] args) {
        String[] arr = {"a", "c"};
        Integer[] arr2 = {3, 4, 8, 9, 10};
        System.out.println(bridgeShuffle(arr, arr2)); // Output: [a, 3, c, 4, 8, 9, 10]
    }

    public static <T> ArrayList<T> bridgeShuffle(T[] a, T[] b) {
        // ... (bridgeShuffle method implementation)
    }
}
