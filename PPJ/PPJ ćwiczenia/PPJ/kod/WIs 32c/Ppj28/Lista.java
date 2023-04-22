public class Lista {

    Element pierwszy, ostatni;

    private static Lista instance;
    private Lista(){}
    public static Lista getInstance(){
        if(instance == null) {
            instance = new Lista();
        }
        return instance;
    }

    void add(Element e) {
        if (pierwszy == null) {
            pierwszy = e;
            ostatni = e;
        } else {
            ostatni.nastepny = e;
            ostatni = e;
        }
    }
    void remove(int i) {
        if (i == 0) {
            if(pierwszy == ostatni) {
                ostatni = null;
            }
            pierwszy = pierwszy.nastepny;

        } else {
            Element tmp = pierwszy;
            for (int j = 0; j < i - 1; j++) {
                tmp = tmp.nastepny;
            }
            if (tmp.nastepny != ostatni) {
                tmp.nastepny = tmp.nastepny.nastepny;
            } else {
                tmp.nastepny = null;
                ostatni = tmp;
            }
        }

    }
    void wypisz() {
        Element tmp = pierwszy;
        do {
            System.out.println(tmp.wartosc);
            tmp = tmp.nastepny;
        } while (tmp != null);
    }
}
