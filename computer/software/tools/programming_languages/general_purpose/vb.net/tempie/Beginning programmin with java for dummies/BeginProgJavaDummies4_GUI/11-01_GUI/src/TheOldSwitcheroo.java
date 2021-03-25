import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TheOldSwitcheroo implements ActionListener {

	JLabel response, goodbye;

	public static void main(String args[]) {
		new TheOldSwitcheroo();
	}

	public TheOldSwitcheroo() {

		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(3, 1));
	
		JLabel prompt = new JLabel("Type your question, my child:  ");
		
		JTextField question = new JTextField(20);
		question.addActionListener(this);
		
		JPanel questionPanel = new JPanel();
		questionPanel.add(prompt);
		questionPanel.add(question);
		frame.add(questionPanel);
		
		JButton button = new JButton("Ask");
		button.addActionListener(this);
		
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button);
        frame.add(buttonPanel);
		
        response = new JLabel(" ");
		
		goodbye = new JLabel(" ");
		
		JPanel responsePanel = new JPanel();
		responsePanel.add(response);
		responsePanel.add(goodbye);
		frame.add(responsePanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random myRandom = new Random();
		int randomNumber;
		randomNumber = myRandom.nextInt(10) + 1;

		switch (randomNumber) {
		case 1:
			response.setText("Yes. Isn't it obvious?");
			break;
		case 2:
			response.setText("No, and don't ask again.");
			break;
		case 3:
			response.setText("Yessir, yessir! Three bags full.");
			break;
		case 4:
			response.setText("What part of 'no' don't you understand?");
			break;
		case 5:
			response.setText("No chance, Lance.");
			break;
		case 6:
			response.setText("Sure, whatever.");
			break;
		case 7:
			response.setText("Yes, but only if you're nice to me.");
			break;
		case 8:
			response.setText("Yes (as if I care).");
			break;
		case 9:
			response.setText("No, not until Cromwell seizes Dover.");
			break;
		case 10:
			response.setText("No, not until Nell squeezes Rover.");
			break;
		default:
			response.setText("You think you have problems? My random number generator is broken!");
			break;
		}

		goodbye.setText("Goodbye");
	}
}
