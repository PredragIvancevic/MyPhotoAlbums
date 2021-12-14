package com.example.moji_foto_albumi;

import java.util.LinkedList;

public class ElementAPI {
    public static LinkedList<Element> vratiListu(){
        LinkedList<Element> list=new LinkedList<Element>();
        list.add(new Element("aerodrom"));
        list.add(new Element("baku1"));
        list.add(new Element("hrana"));
        list.add(new Element("izgradnja"));
        list.add(new Element("lada, ostatak SSSR-a"));
        list.add(new Element("plaza"));
        list.add(new Element("stadion"));
        list.add(new Element("stari_grad"));
        list.add(new Element("tocak"));
        list.add(new Element("voznja"));


        return list;
    }
}
