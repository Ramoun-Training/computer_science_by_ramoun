import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {
		double amount;
		amount = Double.parseDouble(JOptionPane
				.showInputDialog("What's the price of a CD-ROM?"));

		amount = amount + 25.00;
		JFrame frame = new JFrame();
		JLabel label = new JLabel("We will bill $" + amount + " to your credit card.", SwingConstants.CENTER);
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setVisible(true);
	}
}