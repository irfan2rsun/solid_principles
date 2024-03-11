package com.cydeo.solid.dependencyInversion.example.good;

public class MyApp {

    public static void read(com.cydeo.solid.dependencyInversion.example.good.Reader reader) {

        com.cydeo.solid.dependencyInversion.example.good.UserReader userReader = new com.cydeo.solid.dependencyInversion.example.good.UserReader(reader);

        userReader.getUsername();

    }

}
