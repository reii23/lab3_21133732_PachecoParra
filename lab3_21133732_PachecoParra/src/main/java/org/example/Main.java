package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // data

        List <Chatbot> chatbotsIniciales = new ArrayList<>();
        List <Flow> flows = new ArrayList<>();
        List <Option> options = new ArrayList<>();
        List <String> keywords = new ArrayList<>();
        keywords.add("key1");
        keywords.add("key2");

        Option o1 = new Option(1, "mensaje1", 1, 1, keywords);
        options.add(o1);
        Flow f1 = new Flow(1, "mensaje1", options);
        flows.add(f1);
        Chatbot c1 = new Chatbot(1, "chatbot1", "mensaje1", 1, flows);




    }



}









