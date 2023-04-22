import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        printCalendar(11, 2019);

        int x = charsToNumber(new char[]{'1', '2', '3'});
        System.out.println(x);
    }

    public static int charsToNumber(char[] tab) {
        int wynik = 0;
        int potega = 1;
        for (int i = tab.length - 1; i >= 0; i--) {
            wynik += (tab[i] - '0') * potega;
            potega *= 10;
        }
        return wynik;
    }

    public static void printCalendar(int m, int y) {
        int day = -LocalDate.of(y, m, 1).getDayOfWeek().getValue() + 2;
        int lastDay = getLastDay(m, y);
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= 7; j++) {
                printAsNumber(day++, lastDay);
            }
            System.out.println();
        }

    }

    private static int getLastDay(int m, int y) {
        switch (m) {
            case 2:
                return y % 4 == 0 ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static void printAsNumber(int day, int lastDay) {
        if (day <= 0 || day > lastDay)
            System.out.print("   ");
        else if (day < 10)
            System.out.print(" " + day + " ");
        else
            System.out.print(day + " ");
    }


    public static boolean przestepny(int y) {
        return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0);
    }
}