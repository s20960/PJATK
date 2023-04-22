
public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.wypisz();

        lista.add(new Element(5));
        lista.add(new Element(1));
        lista.add(new Element(6));
        lista.add(new Element(8));
        lista.add(new Element(9));
        lista.add(new Element(5));
        lista.add(new Element(0));
        lista.wypisz();
    }
}
