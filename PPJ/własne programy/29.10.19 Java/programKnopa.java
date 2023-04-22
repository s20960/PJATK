public class programKnopa {
    public static void main(String[] args) {
        
		{
            double a = 5;
            double x = 0;
            if (a >= 0) x = 1.701;
            if (a < 0) x = 2D * 3.14f;
            System.out.println(x);
            int i = 0xfaceb00;//k
        }

        for (char a = 'A'; a <= 'z'; a++) {
            System.out.print(a + " ");
        }

        java.util.Scanner in = new java.util.Scanner(System.in);

		//zad 7 PPj7
        {
            int x = 5;
            int n = in.nextInt();
            double wynik = 0;
            boolean czyUjemna = false;
            for (int i = 1; i < n; i += 2) {
                double silnia = 1;
                for (int j = 2; j <= i; j++) {
                    silnia *= j;
                }

                wynik += (czyUjemna ? -1 : 1) * Math.pow(x, i) / silnia;
                czyUjemna = !czyUjemna;
            }
            System.out.println(wynik);
            System.out.println(Math.sin(x));
    }
	
		//zad8 Ppj7
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
                        System.out.print("dziesiÄ™Ä‡");
                        break;
                    case 2:
                        System.out.print("dwadzieĹ›cia");
                        break;
                    case 3:
                    case 4:
                        System.out.print("dzieĹ›ci");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.print("dziesiÄ…t");
                        break;

                }
            }
            if (i == 0) {
                switch (n) {
                    case 1:
                        System.out.print("sto");
                        break;
                    case 2:
                        System.out.print("dwieĹ›cie");
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
