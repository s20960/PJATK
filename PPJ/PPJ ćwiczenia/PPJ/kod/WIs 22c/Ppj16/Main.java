public class Main {
    public static void main(String[] args) {
        byte a = 1;
        MethodCurrier o1 = new MethodCurrier();
        o1.setValue(1);
        o1.setValue(1.0f);
        o1.setValue('a');

        System.out.println(a);
        o1.setValue(a);
        System.out.println(a);

        Number n1 = new Number();
        n1.setValue(1);
        n1.showValue();

        o1.setValue(n1);
        n1.showValue();
    }
}