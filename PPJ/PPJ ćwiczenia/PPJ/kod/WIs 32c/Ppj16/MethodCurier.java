public class MethodCurier {
    void setValue(int a) {
        System.out.println(a + " int"); //3
        a = 10;
        System.out.println(a + " int"); //10
    }
    void setValue(float a) {
        System.out.println(a + " float"); //3
        a = 10f;
        System.out.println(a + " float"); //10
    }
    void setValue(Number a) {
        a.showValue(); //3
        a.setValue(10);
        a.showValue(); //10
    }

}
