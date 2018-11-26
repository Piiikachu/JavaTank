import javax.swing.*;


public class Client extends JFrame {

    private int width;
    private int height;

    public Client(String title,int width,int height){
        this.width=width;
        this.height=height;
        this.setTitle(title);
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
}
