package com.company;

public class Main {

    /*//zad1
    static void show(int a){
        System.out.println(a);
    }
    */
    /* //zad2
    static void modifyValue(int b){
        System.out.println(b);
        b=b*5;
        System.out.println(b);
    }
    */
    /* //zad3
    static void findMax(int x, int y, int z){
        int max=x;
        if(x<y && z<y) max=y;
        if(z>x && z>y) max=z;
        System.out.println(max);
    }
    */

    /* //zad4
    static void policz(char[] zdanie){
        int counter;
        for(int i=0;i<zdanie.length;i++){
            counter=1;
            for(int j=i+1;j<zdanie.length;j++)
                if(zdanie[i]==zdanie[j]){
                    counter++;
                    zdanie[j]=0;
                }
         if(zdanie[i]!=0)
             System.out.println(zdanie[i]+" wystepuje " +counter+ " razy");
        }
    }
    */
    /* //zad5
    static int[] zad5(int[] tabv1, int[] tabv2, int wartosc) {
        int[]brak={};

        if (tabv1.length < tabv2.length) {
            int[] tabw = new int[tabv2.length];
        }

        if (wartosc < 0) {
            if (tabv1.length > tabv2.length) {
                int[] tabw = new int[tabv2.length];
                for (int i = 0; i < tabv2.length; i++) {
                    tabv1[i] = tabv1[i] + tabv2[i];
                    tabw[i] = tabv2[i];
                }
                return tabw;
            } else if (tabv1.length < tabv2.length) {
                int[] tabw = new int[tabv1.length];
                for (int i = 0; i < tabv1.length; i++) {
                    tabv2[i] = tabv2[i] + tabv1[i];
                    tabw[i] = tabv1[i];
                }
                return tabw;
            }
        } else if (wartosc > 0) {

            if (tabv1.length > tabv2.length) {
                int[] tabw = new int[tabv1.length];
                for (int i = (tabv1.length - 1); i > (tabv2.length - 1); i--) {
                    tabw[i] = tabv1[i];
                }
                return tabw;
            } else if (tabv1.length < tabv2.length) {
                int[] tabw = new int[tabv2.length];
                for (int i = (tabv2.length - 1); i > (tabv1.length - 1); i--) {
                    tabw[i] = tabv2[i];
                }
                return tabw;
            }
        }else if(tabv1.length==tabv2.length){
            int[]tabw={};
            return tabw;
        }
        return brak;

     */
    static boolean jestRowna(int tabv1[][], int tabv2[][]) {
        int pomoc=0;
        if (tabv1.length == tabv2.length) {
            for(int i=0;i<tabv1.length;i++) {
                if(tabv1[i].length==tabv2[i].length) pomoc++;
            }
            if(pomoc==tabv1.length) return true;
        }else return false;

    }
}


    public static void main(String[] args) {
        // //zad1 int a=5; show();


        /*//zad2
        int wrt=5;
        System.out.println(wrt);
        modifyValue(wrt);
        System.out.println(wrt);
        */

        /* //zad3
        java.util.Scanner in = new java.util.Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        int k=in.nextInt();

        findMax(i,j,k);
        */

        /* //zad4
        char[] napis={'A','l','a',' ','m','a',' ','k','o','t','a'};
        //policz(napis);
        */
        /* //zad5
        java.util.Scanner in = new java.util.Scanner(System.in);
        int wartosc=in.nextInt();

        int x=((int)(Math.random()*6)+5);
        int y=((int)(Math.random()*6)+5);

        int [] tab1=new int [x];
        int [] tab2=new int [y];

        for(int i=0;i<tab1.length;i++){
            tab1[i]=(int)(Math.random()*10);
        }
        for(int i=0;i<tab2.length;i++){
            tab2[i]=(int)(Math.random()*10);
        }
        zad5(tab1, tab2, wartosc);
        */
        //zad6

        int[][]tab1={
                {4,6,2},
                {7,3,5,9},
                {4,6}
        };
        int[][]tab2={
                {4,6,2},
                {7,3,5,9},
                {4,6}
        };
        jestRowna(tab1,tab2);


    }
}
