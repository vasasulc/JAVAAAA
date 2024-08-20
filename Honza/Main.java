package Honza;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        ImageIcon image = new ImageIcon("Honza\\honza.png");
        JLabel label = new JLabel();
        label.setIcon(image);
        Random random = new Random();

        for (int j = 0; j < Integer.MAX_VALUE; j += 1) {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frame.add(label);
            int x = random.nextInt(1558);
            int y = random.nextInt(590);
            frame.setLocation(x, y);
            frame.setVisible(true);
            frame.pack();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
