import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyJFrame extends JFrame implements KeyListener {

    Thread move, refresh, enemyThr;
    int xPlayer=100;
    int yPlayer=400;
    int direct=0;
    int xEnemy=800;
    int yEnemy=400;
    boolean hurt=true;
    int yourScore=0;
    int highScore=0;
    int erand=0;




    public MyJFrame(){
        super("Projekt");
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(900,500);
        getContentPane().setBackground(new Color(0,0,0));
        setLocationRelativeTo(null);
        addKeyListener(this);
        enemyFun();
        readHighScore();
        refreshFun();


    }

    public void paint(Graphics g){
        super.paint(g);
        draw(g);
    }

    private void draw(Graphics g){
        Player player = new Player();
        player.paint(g, xPlayer,yPlayer);
        Enemy enemy = new Enemy();
        Enemy2 enemy2 = new Enemy2();
        Enemy3 enemy3 = new Enemy3();
        enemy.paint(g,xEnemy,yEnemy);
        switch (erand) {
            case 0:
                enemy.paint(g,xEnemy,yEnemy);
                break;
            case 1:
                enemy2.paint(g,xEnemy,yEnemy);
                break;
            default:
                enemy3.paint(g,xEnemy,yEnemy);
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode()==KeyEvent.getExtendedKeyCodeForChar('w')){
            direct=-1;
            jump();
        }
    }

    public void jump(){
        move = new Thread(()->{
            boolean go = true;
           while(hurt && go) {
               yPlayer += direct;
               if (yPlayer <= 100) {
                   direct = 1;
               } else if (yPlayer == 400) {
                   direct = 0;
                   go = false;
               }
               try {
                   Thread.sleep(4);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        move.start();
    }

    public void refreshFun(){
            refresh = new Thread(()->{
                while(hurt){
                    hit();
                    repaint();

                    try {
                        Thread.sleep(38);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        refresh.start();
    }

    public void enemyFun(){
        enemyThr = new Thread(()->{
            while(hurt){
                if(xEnemy>-10){
                    this.xEnemy--;
                }else{
                    erand=(int)(Math.random()*3);
                    this.xEnemy=800;
                    yourScore++;
                    //System.out.println("Your score: "+yourScore);
                }

                try {
                    Thread.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        enemyThr.start();
    }

    public void hit(){
        if(yPlayer+40>=yEnemy && (xPlayer+40>xEnemy && xPlayer<=xEnemy+40)){
            System.out.println("\n\nHIT!!!");
            System.out.println("GAME OVER\nYour score is: "+yourScore+"\nHighest score is: "+highScore);
            if(highScore<yourScore) System.out.println("Your score is now highscore!!!");
            saveHighScore();
            hurt=false;
        }
    }
    public void readHighScore() {
        try {
            FileInputStream fis = new FileInputStream("HighScore.txt");
            int wrt;
            while ((wrt = fis.read()) != -1) {
                highScore += wrt;
            }
            //System.out.println("High score: "+highScore);
        } catch (IOException e) {

        }
    }
    public void saveHighScore() {
        if (highScore < yourScore) {
            try {
                FileOutputStream fos = new FileOutputStream("HighScore.txt");
                fos.write(yourScore);
                for (int i = 1; (yourScore << (i * 8)) == 0; ) {
                    fos.write(yourScore << (i * 8));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
