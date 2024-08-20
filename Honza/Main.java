package Honza;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        ImageIcon image1 = new ImageIcon("Honza\\honza.png");
        ImageIcon image2 = new ImageIcon("Honza\\honza2.jpg");
        ImageIcon image3 = new ImageIcon("Honza\\honza3.jpg");
        ImageIcon image4 = new ImageIcon("Honza\\honza4.jpg");
        JLabel label = new JLabel();
        Random random = new Random();


        for (int j = 0; j < Integer.MAX_VALUE; j += 1) {
            int cislo = random.nextInt(4)+1;
            JFrame frame = new JFrame();
            switch (cislo){
                case 1: label.setIcon(image1);
                    break;
                case 2: label.setIcon(image2);
                    break;
                case 3: label.setIcon(image3);
                    break;
                case 4: label.setIcon(image4);
                    break;
            }
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frame.add(label);
            int x = random.nextInt(1420);
            int y = random.nextInt(580);
            frame.setLocation(x, y);
            frame.setVisible(true);
            frame.setSize(500, 500);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
