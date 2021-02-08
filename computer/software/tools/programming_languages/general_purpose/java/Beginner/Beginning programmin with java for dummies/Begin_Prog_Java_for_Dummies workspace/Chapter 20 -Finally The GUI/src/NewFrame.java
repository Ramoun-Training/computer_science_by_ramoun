import javax.swing.*;
public class NewFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4617680199285397008L;
	String myvar = "Show the Frame";
	NewFrame() {
		ImageIcon image = new ImageIcon("C:\\Users\\pc _world\\Downloads\\Capture.png");
		JLabel label = new JLabel(image);
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	void method() {
		myvar = myvar + "(now)";
	}
//	NewFrame() {
//		System.out.println("messag from the constructor");
//		myvar = "tell me a joke";
//		method();
//		setVisible(true);
//		System.out.println(myvar);
//	}
}
//Made with ♥ by R}AM#UN>