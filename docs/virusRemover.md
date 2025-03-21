# VirusRemover Java Code Documentation

This document provides documentation for the `VirusRemover` Java code, which removes file names indicating viruses or malware from a string.

## Overview

The `VirusRemover` class contains a method, `remove_virus`, that takes a string of file names separated by spaces and removes any file names that contain "virus" or "malware", unless those file names also contain "anti" or "not".

## Class: `VirusRemover`

### Author

Franco Bernardele

### Usage Example

```java
public class VirusRemover {
    public static void main(String[] args) {
        System.out.println(remove_virus("PC Files: spotifysetup.exe, virus.exe, dog.jpg, lethalmalware.exe, antivirus.exe"));
    }

    public static String remove_virus(String input) {
        // ... (remove_virus method implementation)
    }
}
