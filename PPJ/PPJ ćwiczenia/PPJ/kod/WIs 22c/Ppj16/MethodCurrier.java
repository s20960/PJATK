public class MethodCurrier {

    public void setValue(Number a){
        a.showValue();
        a.setValue(2);
        a.showValue();
    }
    public void setValue(int a){
        System.out.println(a + " int");
        a = 2;
        System.out.println(a + " int");
    }
    public void setValue(float a){
        System.out.println(a + " float");
        a = 2;
        System.out.println(a + " float");
    }
}
