public class Angle {
    private double x;
    public Angle(float stopnie) {
        this.x = stopnie;
        if(x < 0 || x > 360)
            x = 180;
    }
    public Angle(double radian) {
        this((float)(radian * 180 / Math.PI));
    }

    public double degree() {
        return x;
    }
    public double radian() {
        return x * Math.PI / 180;
    }

    public static Angle getComplement(Angle a) {
        return new Angle((float)(360 - a.x));
    }
}
