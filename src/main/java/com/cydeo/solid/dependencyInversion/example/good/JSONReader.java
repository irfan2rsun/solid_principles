package com.cydeo.solid.dependencyInversion.example.good;

public class JSONReader implements com.cydeo.solid.dependencyInversion.example.good.Reader {

    /*

        Example JSON:

        {
            "username": "mikesmith"
        }

     */

    @Override
    public String getUsername() {
        return "{\"username\": \"mikesmith\"}";
    }
}
