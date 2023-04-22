public class Pixel {
    int red, green, blue;

    public Pixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("\u001b[38;2;");
        sb.append(red).append(";").append(green).append(";").append(blue);
        sb.append("m");
        sb.append("\u001b[48;2;");
        sb.append(red).append(";").append(green).append(";").append(blue);
        sb.append("m");
        sb.append("#");

//        String wynik = String.format("\u001b[38;2;%d;%d;%dm▉", red, green, blue);
        return sb.toString();
    }

}
