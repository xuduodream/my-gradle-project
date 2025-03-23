package com.example.api;

import com.example.core.Core;

public class Api {
    public static String getMessage() {
        return "Hello from API! " + Core.getMessage();
    }
}
