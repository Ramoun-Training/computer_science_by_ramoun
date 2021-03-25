package Gui_awt;

import javax.swing.*;
import java.awt.*;

public class Swingy {

	public static void main(String[] args) {
		new frame();
	}

}

class frame extends JFrame {
	Button btn = new Button("Native");
	Checkbox chkbx1 = new Checkbox("one");
	Checkbox chkbx2 = new Checkbox("two");
	Checkbox chkbx3 = new Checkbox("three");
	JFrame window = new JFrame();
	FlowLayout fl = new FlowLayout();
	ImageIcon icon = new ImageIcon("C:\\Users\\Ramoun\\Desktop\\cover.png");
	JLabel label = new JLabel(icon);
	JLabel text = new JLabel("Welcome to my profile");
	JButton click = new JButton("Click Me");
	
	frame() {
		add(label);
		setVisible(true);
		setSize(1200, 570);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(fl);
		add(text);
		add(click);
		add(btn);
		add(chkbx1);
		add(chkbx2);
		add(chkbx3);
	}
}
