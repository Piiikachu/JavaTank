import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EventQueue.invokeLater(()->{
            new Client("Hello world",500,500);
        });

    }
}
