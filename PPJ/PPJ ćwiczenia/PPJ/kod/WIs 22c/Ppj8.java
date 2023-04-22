public class Main {

    public static void main(String[] args) {

        for (int n = 0; n < 5; n++) {
            for (int i = 0; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        double wynik = 0;
        int x = 3;
        boolean czyMinus = false;
        for (int i = 1; i < 20; i += 2){
            long silnia = 1;
            for (int j = 1; j <= i; j++) {
                silnia *= j;
            }
            wynik += (czyMinus ? -1 : 1) * Math.pow(x, i) / silnia;
            czyMinus = !czyMinus;
        }
        System.out.println(wynik);
        System.out.println(Math.sin(x));

        x = 39;
        int czesc = 100;
        if (x > 0 && x < 1000) {
            for (int i = 0; i < 3; i++) {
                int temp = (x / czesc) * czesc;
                czesc /= 10;
                switch (temp) {
                    case 1:
                        System.out.print("jeden");
                        break;
                    case 2:
                        System.out.print("dwa");
                        break;
                    case 3:
                        System.out.print("trzy");
                        break;
                    case 4:
                        System.out.print("cztery");
                        break;
                    case 5:
                        System.out.print("jeden");
                        break;
                    case 6:
                        System.out.print("jeden");
                        break;
                    case 7:
                        System.out.print("jeden");
                        break;
                    case 8:
                        System.out.print("jeden");
                        break;
                    case 9:
                        System.out.print("jeden");
                        break;
                    case 10:
                        System.out.print("jeden");
                        break;
                    case 20:
                        System.out.print("jeden");
                        break;
                    case 30:
                        System.out.print("trzydzieści");
                        break;
                    case 40:
                        System.out.print("jeden");
                        break;
                    case 50:
                        System.out.print("jeden");
                        break;
                    case 60:
                        System.out.print("jeden");
                        break;
                    case 70:
                        System.out.print("jeden");
                        break;
                    case 80:
                        System.out.print("jeden");
                        break;
                    case 90:
                        System.out.print("jeden");
                        break;
                    case 100:
                        System.out.print("jeden");
                        break;
                    case 200:
                        System.out.print("jeden");
                        break;
                    case 300:
                        System.out.print("jeden");
                        break;
                    case 400:
                        System.out.print("jeden");
                        break;
                    case 500:
                        System.out.print("jeden");
                        break;
                    case 600:
                        System.out.print("jeden");
                        break;
                    case 700:
                        System.out.print("jeden");
                        break;
                    case 800:
                        System.out.print("jeden");
                        break;
                    case 900:
                        System.out.print("dziewięćset");
                        break;
                }
                x -= temp;
                System.out.print(" ");
            }
        }

        int i = 10;
        i = i++;
        i = ++i;
        i = i++ + ++i;
        System.out.println(i);

        //int a = 0xfaceb00;

        boolean czyWyjsc = false;
        for (char a = 'a';  a <= 'z' && !czyWyjsc; a++){
            System.out.print(a + " ");
            if (a == 'd') {
                czyWyjsc = true;
            }
        }
        System.out.println((int)'a');

        java.util.Scanner in = new java.util.Scanner(System.in);
        int liczba = 0, maxLiczba = 0, iloscWystapien = 0, aktualny = 0, iloscAktualnego = 0;
        do {
            liczba = in.nextInt();
            if (liczba != aktualny){
                if (iloscAktualnego > iloscWystapien) {
                    maxLiczba = aktualny;
                    iloscWystapien = iloscAktualnego;
                }
                aktualny = liczba;
                iloscAktualnego = 1;
            } else {
                iloscAktualnego++;
            }

        } while(liczba != 0);
        System.out.println(maxLiczba);
        System.out.println(iloscWystapien);
    }
}
