# MessageFromSpace Java Code Documentation

This document provides documentation for the `MessageFromSpace` Java code, which decodes a message from space by repeating characters within brackets a specified number of times.

## Overview

The `MessageFromSpace` class contains a method, `spaceMessage`, that takes an encoded message string as input and returns the decoded message string. The encoded message contains characters within brackets that need to be repeated a certain number of times.

## Class: `MessageFromSpace`

### Author

Franco Bernardele

### Usage Example

```java
package MessageFromSpace;

public class MessageFromSpace {
    public static void main(String[] args) {
        System.out.println(spaceMessage("AB[3CD]")); // Output: ABCDCBCD
        System.out.println(spaceMessage("IF[2E]LG[5O]D")); // Output: IFEELGOOOOOOD
    }

    public static String spaceMessage(String mensaje) {
        // ... (spaceMessage method implementation)
    }
}