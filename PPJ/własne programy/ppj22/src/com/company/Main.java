package com.company;

public class Main {

    public static void main(String[] args) {
	    Drzewo []las=new Drzewo[5];

        for (int i = 0; i <las.length ; i++) {
            int pomoc=(int)(Math.random()*6);
            switch(pomoc){
                case 1:
                    las[i]=new DrzewoIglaste(true,10,"Sosna",5.5435,543);
                    break;
                case 2:
                    las[i]=new DrzewoIglaste(false,14,"modrzew",4.435,563);
                    break;
                case 3:
                    las[i]=new DrzewoLisciaste(false,9,"dab",0);
                    break;
                case 4:
                    las[i]=new DrzewoLisciaste(false,19,"osik",1);
                    break;
                case 5:
                    las[i]=new DrzewoOwocowe(false,13,"morelowiec",2,"morela");
                    break;
                case 0:
                    las[i]=new DrzewoOwocowe(false,16,"sliwa",3,"sliwa");
                    break;
            }
        }
        for (int i = 0; i <las.length ; i++) {
            System.out.println(las[i].toString());
            try{
                las[i].zerwijOwoc();
            }catch(DrzewoBezOwocoweException a){
                System.out.println(a.getMessage());
            }
            System.out.println();
        }
    }
}
