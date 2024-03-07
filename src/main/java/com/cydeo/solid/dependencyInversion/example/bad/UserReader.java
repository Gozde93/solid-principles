package com.cydeo.solid.dependencyInversion.example.bad;

public class UserReader {

    private XMLReader xmlReader;  // What happens if we decide to use JSON format instead of XML format?
//    private JSONReader jsonReader;

    public UserReader(XMLReader xmlReader) {    // We need to add jsonReader in Constructor too
        this.xmlReader = xmlReader;
    }

    public String getUsername() {            // public String getUsernameFromXML()
        return xmlReader.getUsername();
    }

//    public String getUsernameFromJSON() {
//        return jsonReader.getUsername();
//    }

}
