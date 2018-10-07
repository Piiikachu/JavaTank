import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.List;

public class Client extends Frame {
    public static final int GAME_X = 400, GAME_Y = 100;
    public static final int HEIGHT = 600, WIDTH = 800;

    public Color backGround=new Color(0x65,0xc2,0x94);


    public List<Wall> walls=new ArrayList<>();
    //public Tank heroTank=new Tank(GAME_X + WIDTH - Tank.WIDTH, GAME_Y + HEIGHT - Tank.HEIGHT, true, this);

    public Tank heroTank=new Tank(WIDTH - Tank.WIDTH, HEIGHT - Tank.HEIGHT, true, this);
    public Client(){
        Wall w1=new Wall(300,200,10,150);
        Wall w2=new Wall(300,200,200,15);
        //Wall w3=new Wall(790,200,10,150);
        walls.add(w1);
        walls.add(w2);
        //walls.add(w3);
    }

    public void paint(Graphics g){
        Color c=g.getColor();
        g.setColor(Color.WHITE);
        g.setColor(c);

        for (Wall w:walls) {
            w.draw(g);
        }

        heroTank.draw(g);

    }

    public void lauchFrame() {
        this.setTitle("Hello world");
        this.setBackground(backGround);
        this.setLocation(GAME_X, GAME_Y);
        this.setSize(WIDTH, HEIGHT);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e);
                System.exit(0);
            }
        });
        this.setResizable(true);
        this.setVisible(true);

        Thread tankThread=new Thread(new PaintThread());
        tankThread.start();
    }

    private class PaintThread implements Runnable{

        @Override
        public void run() {
            while (true){
                repaint();
                try {
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }



}
