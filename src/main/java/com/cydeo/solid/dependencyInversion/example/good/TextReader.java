package com.cydeo.solid.dependencyInversion.example.good;

public class TextReader implements com.cydeo.solid.dependencyInversion.example.good.Reader {

    @Override
    public String getUsername() {
        return "mikesmith";
    }

}
