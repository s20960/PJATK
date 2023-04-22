public class Main {
    public static void main(String[] args) {
        Angle prosty = new Angle(90);
        System.out.println(prosty.degree());
        System.out.println(prosty.radian());

        Angle prawieProsty = new Angle(1.5);
        System.out.println(prawieProsty.degree());
        System.out.println(prawieProsty.radian());

        Angle dop = Angle.getComplement(prosty);
        System.out.println(dop.degree());
        System.out.println(dop.radian());

    }
}
