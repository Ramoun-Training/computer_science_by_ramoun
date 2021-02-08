import javax.swing.*;
public class ShowPicture {

	public static void main(String[] args) {
		JFrame frame = new JFrame();//window
		JFrame frame2 = new JFrame();
		ImageIcon icon2 = new ImageIcon("C:\\Users\\pc _world\\Desktop\\pic.png");
		ImageIcon icon = new ImageIcon("D:\\Collection\\Photos\\Cartoon\\Journal_3_Book_Cover.png");
		JLabel label = new JLabel(icon);//a place to show my icon(picture) on.
		JLabel label2 = new JLabel(icon2);

		frame.add(label);//makes the label(with the icon on it) appear on the frame(window)
		frame2.add(label2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//what happens when the 'x' button is clicked
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* alternatives:
		JFrame.HIDE_ON_CLOSE
		JFrame.DISPOSE_ON_CLOSE
		JFrame.DO_NOTHING_ON_CLOSE
		*/
		frame.pack();//shrinks the frame to fit around whatever in it.
		frame2.pack();
		frame.setVisible(true);//shows the frame - makes it visible
		frame2.setVisible(true);

	}

}
//Made with ♥ by R}AM#UN>