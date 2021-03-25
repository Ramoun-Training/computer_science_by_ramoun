import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.*;

class Things_I_Like {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		ImageIcon icon = new ImageIcon("C:\\Users\\Ramoun\\Desktop\\form.png");
		JLabel label = new JLabel(icon);
		JLabel text = new JLabel("Programming,Graphic Design,Animation & Art.");
		ImageIcon img = new ImageIcon("C:\\Users\\Ramoun\\Desktop\\img.png");
		
		frame.setVisible(true);
		frame.setSize(406, 330);
		frame.add(label);
		frame.setTitle("Things I Like");
		frame.setResizable(false);
		//frame.add(text);
	}
}
