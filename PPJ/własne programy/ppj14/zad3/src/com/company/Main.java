package com.company;

public class Main {

    static double[] statistica(double tabm[]){
        double[]tabw=new double[3];
        double suma=0;

        for(int i=0;i<tabm.length;i++){
            suma=suma+tabm[i];
        }
        tabw[0]=suma/tabm.length;

        //mediana
        double pomoc=0;
        for(int i=0;i<tabm.length;i++){
            if(tabm[i]>tabm[i+1]){
                pomoc=tabm[i];
                tabm[i]=tabm[i+1];
                tabm[i+1]=pomoc;
            }
        }
        if(tabm.length%2==0) tabw[2]=tabm[tabm.length/2];
        else {
            double wynik=(((tabm.length/2)-0.5)+((tabm.length/2)+0.5))/2;
            tabw[2]=wynik;
        }
        return tabw;
    }

    public static void main(String[] args) {

        double[] tab={4.3, 5.8, 6.66, 3.4, 9};
        statistica(tab);


    }
}
