package com.company;

import java.awt.event.TextEvent;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan", 1948);
        osoba.show();

        Student student = new Student("Tomasz", 1977, 535);
        student.show();

        Osoba tmp = student;
        tmp.show();

        Student tmp2 = (Student) tmp;
        System.out.println(tmp2.ska);

        System.out.println(tmp2);

        C c = new C();
        c.cos();
    }
}
    class A{
        int a;
        public A(){
            a=5;
        }
    }
    class B extends A{
        int b;
        public B() {
            b=10;
        }
    }
    class C extends B {
        int c;
        public C() {
            c = 15;
        }
        public void cos() {
            System.out.println(a + " " + b + " " + c + "\n" ); //+A.this.a
        }
}

