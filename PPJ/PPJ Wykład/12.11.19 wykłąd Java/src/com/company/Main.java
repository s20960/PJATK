package com.company;

public class Main {

    public static void main(String[] args) {
	Ciacho zmienna;
	zmienna=new Ciacho(1000,10,6);

        System.out.println(
            zmienna.iloscKawalkow
        );

        zmienna.show();

        Ciacho c1=new Ciacho();

        Ciacho c2 = new Ciacho(5);
        c2.show();

        Ciacho c3=new Ciacho();

        System.out.println(
            c1==c3
        );

        System.out.println(
            c1.check(c3)
        );

        System.out.println(
            c1.equals(c3)
        );
    }
}
