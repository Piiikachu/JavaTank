import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class Client extends JFrame {

    private int width;
    private int height;

    public Client(String title,int width,int height){
        super(title);
        this.width=width;
        this.height=height;

        MyPanel panel=new MyPanel();
        panel.setPreferredSize(new Dimension(width,height));
        setContentPane(panel);
        pack();
        this.setVisible(true);
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Client(String title){
        this(title,1024,768);
    }

    public int getFrameWidth() {
        return width;
    }

    public int getFrameHeight() {
        return height;
    }

    private class MyPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d=(Graphics2D)g;

            VisHelper.setStrokeWidth(g2d,5);

            g2d.setColor(Color.cyan);
            VisHelper.strokeCircle(g2d,width/2,height/2,200);

            g2d.setColor(Color.ORANGE);
            VisHelper.fillCircle(g2d,width/2,height/2,200);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(width,height);
        }
    }

}
