public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add(new Produkt("Myszka", 50.0, 5));
        lista.add(new Produkt("Klawiatura", 150.0, 3));
        lista.add(new Produkt("Monitor", 2000.0, 1));
        lista.add(new Produkt("Podkładka", 10.0, 5));

        for (int i = 0; i < lista.getLength(); i++) {
            System.out.println(lista.get(i));
        }
        lista.remove(2);
        System.out.println("=================");
        for (int i = 0; i < lista.getLength(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
