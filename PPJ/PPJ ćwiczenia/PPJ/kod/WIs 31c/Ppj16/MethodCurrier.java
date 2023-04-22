public class MethodCurrier {
    void setValue(int a) {
        System.out.println(a + " int"); //1
        a = 10;
        System.out.println(a + " int"); //10
    }
    void setValue(float a) {
        System.out.println(a + " float"); //1.0
        a = 10f;
        System.out.println(a + " float"); //10.0
    }
    void setValue(Number n) {
        n.showValue(); //1
        n.setValue(10);
        n.showValue(); //10
    }
}
