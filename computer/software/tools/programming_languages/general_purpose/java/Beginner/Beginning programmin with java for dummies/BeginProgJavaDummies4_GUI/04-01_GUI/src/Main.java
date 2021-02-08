import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel("Chocolate, royalties, sleep", SwingConstants.CENTER);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
