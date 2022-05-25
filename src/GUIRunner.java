import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.*;

public class GUIRunner {

    public GUIRunner() {
        JFrame frame = new JFrame();


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout());
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new GUIRunner();
    }
}
