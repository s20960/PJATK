package com.company;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(2,9);
        Point p2 = new Point(8,3);

        Rect prostokat = new Rect(p1, p2);

        System.out.println(prostokat.countField());
        System.out.println(prostokat.countDiagonal());
    }
}
