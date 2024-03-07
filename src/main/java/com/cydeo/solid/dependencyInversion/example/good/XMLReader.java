package com.cydeo.solid.dependencyInversion.example.good;

public class XMLReader implements Reader {

    @Override
    public String getUsername() {
        return "<username>mikesmith</username>";
    }

}
