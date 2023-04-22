public class Main {

    public static void main(String[] args) {

        MethodCurrier mc = new MethodCurrier();
        mc.setValue(1); //1 int
        mc.setValue(1f); //1 float
        mc.setValue('a'); //97 int
        mc.setValue((byte)1); // 1 int

        int a = 1;
        float b = 1f;
        Number n = new Number();
        n.setValue(1);

        System.out.println(a); //1
        mc.setValue(a);
        System.out.println(a); //1

        System.out.println(b); //1.0
        mc.setValue(b);
        System.out.println(b); //1.0

        n.showValue(); // 1
        mc.setValue(n);
        n.showValue(); //10


//        Main m = new Main();
      /*  Pizza p = new Pizza(3);
        Pizza p2 = new Pizza(6);
        int[] tab = new int[1];

        System.out.println(p.skladnikiCiasta[0]);
        p.srednica = 42.2f;
        System.out.println(p.srednica);
        p.skladniki = new String[]{"pomidory", "ser", "ananas"};


        System.out.println(Pizza.skladnikiCiasta[0]);
//        System.out.println(Pizza.srednica);

        p.upiecz();
        Pizza.zagniec();*/
    }

}
