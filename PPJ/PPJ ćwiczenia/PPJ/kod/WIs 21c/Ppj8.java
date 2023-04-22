public class Main {
    public static void main(String[] args) {
        int x = 5;
        double wynik = 0;
        boolean czyMinus = false;
        for (int i = 1; i < 20; i += 2) {
            long silnia = 1;
            for (int j = 2; j <= i; j++) {
                silnia *= j;
            }

            wynik += (czyMinus ? -1 : 1) * Math.pow(x, i) / silnia;
            czyMinus = !czyMinus;
        }
        System.out.println(wynik);
        System.out.println(Math.sin(x));

        int a = 27;
        int p = 100;
        for (int i = 0; i < 3; i++) {
            int n = a / p;
            switch (n) {
                case 1:
                    if (i == 2)
                        System.out.print("jeden");
                    break;
                case 2:
                    if (i == 2)
                        System.out.print("dwa");
                    break;
                case 3:
                    System.out.print("trzy");
                    break;
                case 4:
                    if (i == 2 || i == 0)
                        System.out.print("cztery");
                    else
                        System.out.print("czter");
                    break;
                case 5:
                    System.out.print("piec");
                    break;
                case 6:
                    System.out.print("szesc");
                    break;
                case 7:
                    System.out.print("siedem");
                    break;
                case 8:
                    System.out.print("osiem");
                    break;
                case 9:
                    System.out.print("dziewiec");
                    break;
            }
            if (i == 1) {
                switch (n) {
                    case 1:
                        System.out.print("dziesięć ");
                        break;
                    case 2:
                        System.out.print("dwadzieścia ");
                        break;
                    case 3:
                    case 4:
                        System.out.print("dzieści ");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.print("dziesiąt ");
                        break;

                }
            }
            if (i == 0) {
                switch (n) {
                    case 1:
                        System.out.print("sto ");
                        break;
                    case 2:
                        System.out.print("dwieście ");
                        break;
                    case 3:
                    case 4:
                        System.out.print("sta ");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.print("set ");
                        break;

                }
            }
            a %= p;
            p /= 10;
        }

        int liczba = 0;
        int najdluzszyCiag = 0, najdluzszyCiagWartosc = 0;
        int aktualnyCiag = 0, aktualnyCiagWartosc = 0;

        java.util.Scanner in = new java.util.Scanner(System.in);
        do {
            liczba = in.nextInt();

            if (liczba != aktualnyCiagWartosc) {
                if (aktualnyCiag > najdluzszyCiag) {
                    najdluzszyCiagWartosc = aktualnyCiagWartosc;
                    najdluzszyCiag = aktualnyCiag;
                }
                aktualnyCiagWartosc = liczba;
                aktualnyCiag = 1;
            } else {
                aktualnyCiag++;
            }

        } while(liczba != 0);
        System.out.println("Najdłuższy ciąg składa się z " + najdluzszyCiag
                                            + " liczb " + najdluzszyCiagWartosc);

        for (char i = 'a'; i <= 'z' ; i++) {
            System.out.print(i + " ");
        }
    }
}
