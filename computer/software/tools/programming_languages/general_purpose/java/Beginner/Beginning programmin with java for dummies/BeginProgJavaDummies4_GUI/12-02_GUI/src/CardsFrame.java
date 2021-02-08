import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardsFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	/* Images of cards are from jfitz.com/cards */
	JLabel[] cardLabels = new JLabel[7];
	JButton button;
	Random random = new Random();
	int count = 0, total = 0;

	public CardsFrame() {
		setLayout(new GridLayout(1, 8));
		setSize(700, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel buttonPanel = new JPanel();
		button = new JButton("Deal");
		button.addActionListener(this);
		buttonPanel.add(button);
		add(buttonPanel);

		for (int i = 0; i < 7; i++) {
			cardLabels[i] = new JLabel(new ImageIcon("back.png"));
			add(cardLabels[i]);
		}

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int number = random.nextInt(12) + 1;
		int suit = random.nextInt(3) + 1;
        String filename = "" + suit + number + ".png";
        cardLabels[count++].setIcon(new ImageIcon(filename));
        total += (number <= 10) ? number : 10;
        
        if (total < 21) {
        	setTitle("" + total);
        } else {
        	if (total == 21) {
        		setTitle(total + " You win");
        	} else {
        		setTitle(total + " You lose");
        	}
        	button.setEnabled(false);
        }
	}
}
