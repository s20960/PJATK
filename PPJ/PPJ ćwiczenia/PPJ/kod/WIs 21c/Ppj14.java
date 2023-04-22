public class Main {
    public static void main(String[] args) {
        System.out.println('3' - '0');
        char[] tab = {'1', '2', '3'};
        System.out.println(charsToNumber(tab));
    }

    static int charsToNumber(char[] tab) {
        int potega = 1;
        int wynik = 0;
        for (int i = tab.length - 1; i >= 0; i--) {
            wynik += (tab[i] - '0') * potega;
            potega *= 10;
        }
        return wynik;
    }
}