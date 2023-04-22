public class MethodCurrier {
    public void setValue(int a) {
        System.out.println(a + " int");
    }
    public void setValue(float a) {
        System.out.println(a + " float");
    }
    public void setValue(Number a) {
        a.showValue();
        a.setValue(2);
        a.showValue();
    }
}
