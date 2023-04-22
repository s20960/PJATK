public class Main {

    public static void main(String[] args) {
        MethodCurrier mt = new MethodCurrier();
        mt.setValue(1);
        mt.setValue(1f);
        mt.setValue('a');
        mt.setValue((byte)12);

        System.out.println("=============");
        Number n = new Number();
        n.setValue(1);
        n.showValue();
        mt.setValue(n);
        n.showValue();


        /*Ciacho.cenaZaKilogram = 12;
        Ciacho.shows();


        Ciacho c1 = new Ciacho(5);
        Ciacho c3 = c1;
        System.out.println(c1.waga);
        c1.waga = 0.2f;

        Ciacho.shows();

        System.out.println(c1.cenaZaKilogram * c1.waga);
        Ciacho c2 = new Ciacho();
        c2.waga = 0.3f;
        System.out.println(c2.cenaZaKilogram * c2.waga);
        c1.showns();
        Ciacho.shows();*/
    }
}
