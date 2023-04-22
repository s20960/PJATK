import java.awt.*;

public class Enemy3 {
    public void paint(Graphics g, int x, int y){
        g.setColor(new Color(0,0,255));
        g.fillOval(x,y,40,40);
    }
}
