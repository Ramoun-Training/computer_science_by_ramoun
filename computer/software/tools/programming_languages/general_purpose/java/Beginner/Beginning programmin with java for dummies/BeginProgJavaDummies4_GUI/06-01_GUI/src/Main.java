import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {
		double amount;
		amount = 5.95;
		amount = amount + 25.00;
		JFrame frame = new JFrame();
		JLabel label = new JLabel("We will bill $" + amount + " to your credit card.", SwingConstants.CENTER);
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setVisible(true);
	}
}