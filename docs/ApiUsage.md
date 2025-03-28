# ApiUsage Java Code Documentation

This document provides documentation for the `ApiUsage` Java code, which retrieves Pokemon data from the PokeAPI.

## Overview

The `ApiUsage` class contains a method, `useAPI`, that retrieves Pokemon data from the PokeAPI based on a given Pokemon ID. It uses HTTP requests and the Gson library to parse the JSON response.

## Class: `ApiUsage`

### Author

Franco Bernardele

### Usage Example

```java
package ApiUsage;

import com.google.gson.Gson;

public class ApiUsage {
    public static void main(String[] args) {
        System.out.println(useAPI(5)); // Output: Pokemon{name='charmeleon', id=5, height=11} or ERROR
    }

    public static String useAPI(int id) {
        // ... (useAPI method implementation)
    }
}

class Pokemon {
    // ... (Pokemon class implementation)
}