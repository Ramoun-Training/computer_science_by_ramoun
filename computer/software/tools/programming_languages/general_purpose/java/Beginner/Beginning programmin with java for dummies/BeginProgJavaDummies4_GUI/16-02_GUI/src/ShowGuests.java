import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ShowGuests {

    public static void main(String args[]) {
        int guests[] = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
        int roomNum = 0;

        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(11, 2));
        frame.add(new JLabel("Room"));
        frame.add(new JLabel("Guests"));
        for (int numGuests : guests) {
            frame.add(new JLabel(Integer.toString(roomNum++)));
            frame.add(new JLabel(Integer.toString(numGuests)));
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
