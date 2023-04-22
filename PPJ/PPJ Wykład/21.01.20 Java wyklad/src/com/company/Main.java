package com.company;

public class Main {

    public static void main(String[] args) {
        Element el=new Element("Ala");

        MyList list = new MyList();
        list.add(el);
        list.add(new Element("ma"));

        list.show();

        list.addToFront(
                new Element("kota")
        ;
        list.show();
    }
}
