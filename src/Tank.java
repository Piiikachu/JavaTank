import java.awt.*;

public class Tank {
    public static final int SPEED = 5;
    public static final int WIDTH = 30, HEIGHT = 30;
    public static final int SCORE = 5;
    public static final int HEROBLOOD = 200;
    public static final int ENEMYBLOOD = 20;
    public static final int BLOODINCREASE = 50;


    private int x,y;
    private int oldx,oldy;
    private boolean hero;
    private int life;
    private boolean live=true;
    private Color tankColor;
    private Client client;

    public Tank(int x, int y, boolean hero, Client client){
        this.x = x;
        this.y = y;
        this.oldx=x;
        this.oldy=y;
        this.hero = hero;
        this.client = client;
        this.life = this.hero ? HEROBLOOD:ENEMYBLOOD;
        this.tankColor=this.hero?new Color(0xfc,0xaf,0x17):new Color(0xf2, 0xea, 0xda);
    }

    public void draw(Graphics g){
        if (!live){
            if (!hero){

            }else {
                Color c=g.getColor();
                g.setColor(Color.MAGENTA);
                g.drawString("game over",100,100);
                g.setColor(c);
            }
            return;
        }

        Color c=g.getColor();
        g.setColor(tankColor);
        g.fillOval(x,y,WIDTH,HEIGHT);
        g.setColor(Color.BLUE);


        g.setColor(c);


    }


}
