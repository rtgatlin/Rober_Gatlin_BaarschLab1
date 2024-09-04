import java.awt.*;
import javax.swing.JFrame;

public class MakingChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Making Change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));

        frame.add(new RegisterPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
