import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Client extends Frame {
    public static final int GAME_X = 400, GAME_Y = 100;
    public static final int HEIGHT = 600, WIDTH = 800;


    public void lauchFrame() {
        this.setTitle("Hello world");
        this.setBackground(Color.white);
        this.setLocation(GAME_X, GAME_Y);
        this.setSize(WIDTH, HEIGHT);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e);
                System.exit(0);
            }
        });
        this.setResizable(false);
        this.setVisible(true);

    }
}
