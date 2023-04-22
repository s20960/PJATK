import java.awt.*;

public class Player {

    public void paint(Graphics g, int x, int y){

        int [] xPoints={x,x+10,x+15,x+25,x+25,x+15,x+11,x+15,x+20,x+24,x+30,x+40,x+30,x+24,x+21,x+14,x+11,x+15,x+25,x+25,x+15,x+10,x   ,x};
        int [] yPoints={y,y   ,y+5 ,y+5 ,y+6 ,y+6 ,y+10,y+14,y+14,y+10,y+10,y+20,y+30,y+30,y+27,y+27,y+30,y+34,y+34,y+35,y+35,y+40,y+40,y};

        g.setColor(new Color(155,155,155));
        g.fillPolygon(xPoints,yPoints,xPoints.length);

    }


}
