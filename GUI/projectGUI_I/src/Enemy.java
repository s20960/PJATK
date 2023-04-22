import java.awt.*;

public class Enemy {



    public void paint(Graphics g, int x, int y){


        g.setColor(new Color(255,0,0));
        g.fillOval(x,y,40,40);


//        int [] xPoints={x+5,x+10,x+40,x+40,x+20,x+40,x+20,x   };
//        int [] yPoints={y,  y+10,y   ,y+20,y+20,y+40,y+40,y+20};
//        g.fillPolygon(xPoints,yPoints,xPoints.length);
    }
}
