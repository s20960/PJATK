package com.company;

public class MySingletone {

    private static MySingletone obj;

    private MySingletone(){
    }

    public static MySingletone make() {
        if(obj==null)
            obj = new MySingletone();
        return  obj;


    }
}
