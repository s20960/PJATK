package com.company;

public class Main {
    public static void metod1() {
        System.out.println("metoda1");

    }
    public static int metod3(){
        if(true) return 15;
        return 20;
    }
    public static void metod4(int val){
        System.out.println("metod4: int");
    }
    public static void metod4(double val){
        System.out.println("metod5: double");
    }

//====================================

    public static void metod5(int val){
        System.out.println("metod5: "+val);
        val+=50;
        System.out.println("metod5: "+val);
    }

    public static void metod6(int[] a){
        System.out.println("metod6 "+a[0]+" "+a[1]+" "+a[2]);
        a[0]=60;
        System.out.println("metod6 "+a[0]+" "+a[1]+" "+a[2]);
    }

    public static void metod7(int wrt){
        System.out.println("metoda7: " +wrt);
        if(wrt>0)
            metod7(wrt-1);
        System.out.println("metoda7: " +wrt);
    }

    public static void main(String[] args){
        metod1();

        int wrt=metod3();
        System.out.println(metod3());

        metod4(10l);

        wrt =25;
        System.out.println("wrt: "+wrt);
        metod5(wrt);
        System.out.println("wrt: "+wrt);

        int [] tab = {1,2,3};
        show(tab);
        metod6(tab);
        show(tab);

        metod7(20);
    }
    public static void metod2(){
        metod1();
    }

    public static void show(int[]tab){
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println();
    }







}
