public class Lista {
    private Element root;
    private int len = 0;

    public Lista() {
        this.root = null;
    }

    public void add(Produkt p) {
        if (root == null) {
            root =  new Element(p);
        } else {
            Element tmp = root;
            while (tmp.nastepny != null) {
                tmp = tmp.nastepny;
            }
            tmp.nastepny = new Element(p);
        }
        len++;
    }
    public Produkt get(int i) {
        if (i >= len) return null;
        Element tmp = root;
        for (int j = 0; j < i; j++) {
            tmp = tmp.nastepny;
        }
        return tmp.produkt;
    }

    public void remove(int i) {
        if (i >= len) return;
        Element tmp = root;
        for (int j = 0; j < i - 1; j++) {
            tmp = tmp.nastepny;
        }
        Element kolejny = null;
        if(tmp.nastepny.nastepny != null) {
            kolejny = tmp.nastepny.nastepny;
        }
        tmp.nastepny = kolejny;
        len--;
    }

    public int getLength() {
        return len;
    }
}
