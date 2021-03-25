import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ShowPicture {

  public static void main(String args[]) {
    new MyFrame();
  }
}

class MyFrame extends JFrame {
  
  private static final long serialVersionUID = 1L;

  MyFrame() {
    ImageIcon icon = new ImageIcon("androidBook.jpg");
    JLabel label = new JLabel(icon);
    add(label);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }
}
