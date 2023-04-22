package com.company;

public class MethodCurrier {

    static void setValue(int x) {
        System.out.println(x+" int");
    }

    static void setValue(float y) {
        System.out.println(y+" float");
    }

    static void setValue(Number a){
        a.showValue();
        a.setValue(10);
        a.showValue();

    }

}
