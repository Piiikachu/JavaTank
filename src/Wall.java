import java.awt.*;

public class Wall {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;


    public Wall(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = new Color(0xf1,0x5a,0x22);
    }

    public Wall(int x, int y, int width, int height,Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g){
        Color c=g.getColor();
        g.setColor(this.color);
        g.fillRect(this.x,this.y,this.width,this.height);
        g.setColor(c);
    }

    public Rectangle getRect(){
        return new Rectangle(this.x,this.y,this.width,this.height);
    }

}
