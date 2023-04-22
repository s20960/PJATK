public class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int liczba;
        int najIle = 0, najWartosc = 0;
        int aWartosc = 0, aIle = 0;

        for (char i = 'a'; i <= 'z' ; i++) {
            System.out.print(i + " ");
        }

        do {
            liczba = in.nextInt();
            if (liczba != aWartosc) {
                if (aIle > najIle) {
                    najIle = aIle;
                    najWartosc = aWartosc;
                }
                aWartosc = liczba;
                aIle = 1;
            } else {
                aIle++;
            }
        } while(liczba != 0);
        System.out.println("Najdluzszy podciag liczby " + najWartosc
                                                + " (" + najIle + " wystapien)");

        int x = 5;
        double wynik = 0;
        boolean czyUjemny = false;
        for(int i = 1; i < 20; i += 2) {
            double silnia = 1;
            for (int j = 2; j <= i; j++) {
                silnia *= j;
            }

            wynik += (czyUjemny ? -1 : 1) * Math.pow(x, i) / silnia;
            czyUjemny = !czyUjemny;
        }
        System.out.println(wynik);
        System.out.println(Math.sin(x));


        int a = in.nextInt();
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
                        System.out.print("dziesięć");
                        break;
                    case 2:
                        System.out.print("dwadzieścia");
                        break;
                    case 3:
                    case 4:
                        System.out.print("dzieści");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.print("dziesiąt");
                        break;

                }
            }
            if (i == 0) {
                switch (n) {
                    case 1:
                        System.out.print("sto");
                        break;
                    case 2:
                        System.out.print("dwieście");
                        break;
                    case 3:
                    case 4:
                        System.out.print("sta");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.print("set");
                        break;

                }
            }
            System.out.print(" ");
            a %= p;
            p /= 10;
        }
    }
}
