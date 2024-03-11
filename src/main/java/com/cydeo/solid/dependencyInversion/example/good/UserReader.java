package com.cydeo.solid.dependencyInversion.example.good;

public class UserReader {

    private com.cydeo.solid.dependencyInversion.example.good.Reader reader;

    public UserReader(com.cydeo.solid.dependencyInversion.example.good.Reader reader) {
        this.reader = reader;
    }

    public String getUsername() {
        return reader.getUsername();
    }

}
