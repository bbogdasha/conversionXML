package com.bogdan;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Converter {

    private static final String filePathOne = "XmlDeserialization.xml";
    private static final String filePathTwo = "XmlSerialization.xml";
    private static final ObjectMapper mapper = new XmlMapper();
    private static final ObjectMapper writer = mapper.enable(SerializationFeature.INDENT_OUTPUT);

    public static void XMLToObjects() {
        try {
            Company company = mapper.readValue(new File(filePathOne), Company.class);
            System.out.println(writer.writeValueAsString(company));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void objectsToXML(University university) {
        try {
            writer.writeValue(new File(filePathTwo), university);
            System.out.println("XML created!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
