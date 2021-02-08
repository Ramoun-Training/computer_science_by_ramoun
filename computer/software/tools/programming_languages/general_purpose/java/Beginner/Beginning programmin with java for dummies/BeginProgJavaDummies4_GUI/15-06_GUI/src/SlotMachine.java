import java.awt.GridLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/* Fruit images from all-free-download.com */

public class SlotMachine extends JFrame {

	private static final long serialVersionUID = 1L;
	final int DELAY = 250;
	JLabel[] fruitLabel = new JLabel[3];
	Random random = new Random();

	public SlotMachine() {
		setLayout(new GridLayout(1, 3));
		setSize(900, 226);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < 3; i++) {
			fruitLabel[i] = new JLabel(new ImageIcon("0.png"));
			add(fruitLabel[i]);
		}

		setVisible(true);
		
		while (true) {
			int position = random.nextInt(3);
			int fruit = random.nextInt(4);
			
			fruitLabel[position].setIcon(new ImageIcon(fruit + ".png"));
			try {
				Thread.sleep(DELAY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
