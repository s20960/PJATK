public class Pixel {
    int r, g, b;
    public Pixel(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\u001b[38;2;");
        sb.append(r).append(";").append(g).append(";").append(b).append("m");
        sb.append("\u001b[48;2;");
        sb.append(r).append(";").append(g).append(";").append(b).append("m##");
        return sb.toString();
    }
}
