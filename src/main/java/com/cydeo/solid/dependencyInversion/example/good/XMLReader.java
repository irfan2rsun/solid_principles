package com.cydeo.solid.dependencyInversion.example.good;

public class XMLReader implements com.cydeo.solid.dependencyInversion.example.good.Reader {

    @Override
    public String getUsername() {
        return "<username>mikesmith</username>";
    }

}
