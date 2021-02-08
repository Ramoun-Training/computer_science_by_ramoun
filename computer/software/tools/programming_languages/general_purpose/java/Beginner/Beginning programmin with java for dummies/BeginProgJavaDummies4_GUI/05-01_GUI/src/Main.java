import javax.swing.JOptionPane;

public class Main {

	public static void main(String args[]) {
		String inputString = JOptionPane
				.showInputDialog("Enter some text");


		JOptionPane.showMessageDialog(null, inputString);
	}
}
