import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {
		int quarters, dimes, nickels, cents;
		int whatsLeft, total;
		total = Integer.parseInt(JOptionPane
				.showInputDialog("How many cents do you have?"));

		quarters = total / 25;
		whatsLeft = total % 25;

		dimes = whatsLeft / 10;
		whatsLeft = whatsLeft % 10;

		nickels = whatsLeft / 5;
		whatsLeft = whatsLeft % 5;

		cents = whatsLeft;

		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		JLabel label1 = new JLabel("<html>From " + total
				+ " cents you get</html>");
		JLabel label2 = new JLabel("<html>" + quarters + " quarters<br>"
				+ dimes + " dimes<br>" + nickels + " nickels<br>" + cents
				+ " cents</html>", SwingConstants.CENTER);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label1);
		frame.add(label2);
		frame.setVisible(true);
	}
}