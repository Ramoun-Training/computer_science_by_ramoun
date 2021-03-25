import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class DLM {

	private JFrame frame;
	private JTextField txtTestTheJtestfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DLM window = new DLM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DLM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 155);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblResult = new JLabel(" ");
		lblResult.setForeground(new Color(204, 51, 204));
		lblResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		lblResult.setVerticalAlignment(SwingConstants.TOP);
		lblResult.setIcon(null);
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblResult.setBackground(Color.PINK);
		lblResult.setBounds(11, 75, 534, 32);
		frame.getContentPane().add(lblResult);
		
		txtTestTheJtestfield = new JTextField();
		txtTestTheJtestfield.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
		});
		txtTestTheJtestfield.setForeground(new Color(204, 204, 204));
		txtTestTheJtestfield.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTestTheJtestfield.setText("enter text in small capse");
		txtTestTheJtestfield.setBounds(6, 11, 463, 53);
		frame.getContentPane().add(txtTestTheJtestfield);
		txtTestTheJtestfield.setColumns(10);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ImageIcon hover = new ImageIcon("C:/Users/pc _world/Desktop/hover.png");
				label.setIcon(hover);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ImageIcon normal = new ImageIcon("C:/Users/pc _world/Desktop/normalment.png");
				label.setIcon(normal);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				ImageIcon hover = new ImageIcon("C:/Users/pc _world/Desktop/hover.png");
				label.setIcon(hover);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				ImageIcon click = new ImageIcon("C:/Users/pc _world/Desktop/click.png");
				label.setIcon(click);
				lblResult.setText(txtTestTheJtestfield.getText().toUpperCase());
				
			}
		});
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\pc _world\\Desktop\\normalment.png"));
		label.setBounds(479, 0, 61, 73);
		frame.getContentPane().add(label);
		
	}
}
