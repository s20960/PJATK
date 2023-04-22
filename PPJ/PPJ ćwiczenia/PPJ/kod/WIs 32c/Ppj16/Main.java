public class Main {

    public static void main(String[] args) {
        /*System.out.println(Biurko.material);
        //System.out.println(Biurko.szuflady[0]);
        Biurko b1 = new Biurko();
        b1.szuflady[0] = 1;
        System.out.println(b1.szuflady[0]);
        System.out.println(b1.material);
        b1.material = "Metal";

        Biurko b2 = new Biurko(1);
        b2.szuflady[0] = 2;
        System.out.println(b2.szuflady[0]);
        System.out.println(b2.material);

        System.out.println(b1.szuflady[0]);

        Biurko.pokaz();
        //Biurko.pokaz2();
        b1.pokaz2();*/

        MethodCurier mc = new MethodCurier();

        Number n = new Number();
        n.setValue(3);
        int i = 3;
        float f = 3f;
        System.out.println(i); //3
        mc.setValue(i);
        System.out.println(i); //3

        System.out.println(f); //3
        mc.setValue(f);
        System.out.println(f); //3

        System.out.println(n); //3
        mc.setValue(n);
        System.out.println(n); //10



    }

}
