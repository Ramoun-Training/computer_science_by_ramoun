import java.awt.*;//font,GridLayout
import javax.swing.*;//JFrame,JLabel

public class phoneTable {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		ImageIcon image = new ImageIcon("C:\\Users\\pc _world\\Downloads\\Capture.png");
		JButton button = new JButton(image);
		JLabel label[] = {
				new JLabel("Name"),new JLabel("Phone"),
				new JLabel("Ramoun"),new JLabel("020-20220220"),
				new JLabel("tarek"),new JLabel("2561868"),
				new JLabel("omat"),new JLabel("0101557022")
		};
		window.add(label[0]);//add this as it appear
		window.add(label[1]);//this too.
		
		window.setLayout(new GridLayout(4,2));
		
		JLabel fontLabel = new JLabel("NAME");
		Font font = fontLabel.getFont();
		Font plainFont = new Font(font.getName(),Font.PLAIN,font.getSize());
		for (int i = 2; i < 8; i++) {
			label[i].setFont(plainFont);
			window.add(label[i]);
		}
		window.add(button);
		window.setTitle("icon Button");
		window.pack();
		window.setVisible(true);

	}

}
