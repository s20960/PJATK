package zad9;

public class Main {
    public static void main(String[] args) {
        String iK="jest";
        String color="blue";

/*
        Telefon zadanie1 = new Telefon(iK, color);
        Komorka zadanie2 = new Komorka(iK, color);
        Smartfon zadanie3= new Smartfon(iK, color);
        zadanie3.dodajznaj(new Osoba("Jan", "Kowalski", "111-111-111"));

        for (int i = 0; i <10 ; i++) {
            zadanie2.zadzwon(numer);
        }
        zadanie3.zadzwon("111-111-111");
        zadanie3.zadzwon("111-111-112");

        zadanie1.wyswietlHistoriePolaczen();
        zadanie2.wyswietlHistoriePolaczen();
        zadanie3.wyswietlHistoriePolaczen();

 */
    Telefon[]stacjonarne=new Telefon[3];
        for (int i = 0; i <3 ; i++) {
            int x=(int)(Math.random()*3);
            switch(x){
                case 0:
                    stacjonarne[i]=new Telefon(iK, color);
                    break;
                case 1:
                    stacjonarne[i]=new Komorka(iK, color);
                    break;
                case 2:
                    stacjonarne[i]=new Smartfon(iK, color);
                    break;
            }
            for (int j = 0; j <10 ; j++) {
                int num1 = (int) ((Math.random() * 899) + 100);
                int num2 = (int) ((Math.random() * 899) + 100);
                int num3 = (int) ((Math.random() * 899) + 100);
                String numer = num1 + "-" + num2 + "-" + num3;
                stacjonarne[i].zadzwon(numer);
            }
            System.out.println("");

        }
        for (int i = 0; i <3; i++) {
            stacjonarne[i].wyswietlHistoriePolaczen();
            System.out.println("");
        }




    }
}
