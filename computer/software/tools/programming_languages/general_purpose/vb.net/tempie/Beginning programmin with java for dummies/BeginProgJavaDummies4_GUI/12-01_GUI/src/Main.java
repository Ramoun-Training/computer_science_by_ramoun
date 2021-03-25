import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main implements ActionListener {

	JLabel dice = new JLabel("         ");
	JButton button;
	Random myRandom = new Random();
	int die1 = 0, die2 = 0;

	public static void main(String args[]) {
		new Main();
	}

	public Main() {

		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());

		button = new JButton("Roll");
		button.addActionListener(this);
		frame.add(button);

		frame.add(dice);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		die1 = myRandom.nextInt(6) + 1;
		die2 = myRandom.nextInt(6) + 1;
		dice.setText(die1 + "     " + die2);

		int total = die1 + die2;
		if (total == 7 || total == 11) {
			JOptionPane.showMessageDialog(null, "Rolled " + total);
			button.setEnabled(false);
		}
	}
}
