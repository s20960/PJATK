package com.company;

public class Main {
    public static void main(String[] args) {
        Drzewo wierzba=new Drzewo();

        Owoc []zerwany=new Owoc[100];

        int jcount=0;
        int gcount=0;
        int pcount=0;
        double mlaczna=0;

        for (int i = 0; i <zerwany.length&&mlaczna<5000 ; i++) {
            zerwany[i]=wierzba.zerwijOwoc();
            mlaczna+=zerwany[i].masa();
            switch (zerwany[i].nazwa()) {
                case "jablko":
                    jcount++;
                    break;
                case "pomarancza":
                    pcount++;
                    break;
                case "gruszka":
                    gcount++;
                    break;
            }
        }
        System.out.println("jablka: "+jcount+", gruszki: "+gcount+", pomarancze: "+ pcount+"masa łączna: "+mlaczna);


    }
}
