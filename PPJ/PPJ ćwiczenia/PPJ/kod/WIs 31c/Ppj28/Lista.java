public class Lista {
    Element pierwszy;
    Element ostatni;
    int length = 0;

    void add(Element el) {
        if (pierwszy == null) {
            pierwszy = el;
            ostatni = el;
        } else {
            ostatni.nastepny = el;
            ostatni = el;
        }
        length++;
    }

    void wypisz(){
        if (pierwszy == null) {
            System.out.println("Pusta lista");
            return;
        }

        Element tmp = pierwszy;
        do {
            System.out.println(tmp.wrt);
            tmp = tmp.nastepny;
        } while (tmp != null);
    }
}
