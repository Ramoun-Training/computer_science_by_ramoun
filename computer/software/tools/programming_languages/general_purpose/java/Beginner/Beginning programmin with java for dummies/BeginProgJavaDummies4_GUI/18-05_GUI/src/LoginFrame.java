import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JTextField usernameField = new JTextField(20);
	JPasswordField passwordField = new JPasswordField(20);
	
	public LoginFrame() {
		setLayout(new GridLayout(3,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel usernamePanel = new JPanel();
        usernamePanel.add(new JLabel("Username:"));
        usernamePanel.add(usernameField);
        add(usernamePanel);
        
        JPanel passwordPanel = new JPanel();
        passwordPanel.add(new JLabel("Password:"));
        passwordPanel.add(passwordField);
        add(passwordPanel);
        
        JPanel buttonPanel = new JPanel();
        JButton button = new JButton("Login");
        button.addActionListener(this);
        buttonPanel.add(button);
        add(buttonPanel);
        
        pack();
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String response;
		if (usernameField.getText().equals("me") && passwordField.getText().equals("swordfish")) {
			response = "You're okay!";
		} else {
			response = "You're a menace.";
		}
		JOptionPane.showMessageDialog(null, response);
	}
}
