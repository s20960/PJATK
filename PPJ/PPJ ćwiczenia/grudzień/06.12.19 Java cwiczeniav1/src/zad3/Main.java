package zad3;

public class Main {
    public static void main(String[] args) {

        int bok=15;
        Kwadrat figuraK =new Kwadrat(bok);

        double promien=5;
        double wysokosc=10;
        Walec figuraW=new Walec(promien,wysokosc);

        KulaW wpisanaW=new KulaW(figuraW);
        KulaW wpisanaK=new KulaW(figuraK);

        wpisanaK.showK();
        wpisanaW.showW();

        KulaNa opisanaW=new KulaNa(figuraW);
        KulaNa opisanaK=new KulaNa(figuraK);

        opisanaK.showK();
        opisanaW.showW();

    }
}
