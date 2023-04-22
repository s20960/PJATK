package com.company;

public
    class Main {

    public static void main(String[] args) {
        MyStorage ciagZnakow = new MyStorage();

        ciagZnakow.add('A');
        ciagZnakow.add('l');



        ciagZnakow.show();

        ciagZnakow.add('a');
        ciagZnakow.add(' ');
        ciagZnakow.add('m');
        ciagZnakow.add('a');
        ciagZnakow.add(' ');
        ciagZnakow.add('k');
        ciagZnakow.add('o');
        ciagZnakow.add('t');
        ciagZnakow.add('a');

        ciagZnakow.show();

        System.out.println(
            ciagZnakow.length()
        );
        int[] tab={1,2,3};
        System.out.println(
            tab.length

        );

        ciagZnakow.replace(4,'Y');
        ciagZnakow.show();

        ciagZnakow.replace('a','b');
        ciagZnakow.show();


    }
}
