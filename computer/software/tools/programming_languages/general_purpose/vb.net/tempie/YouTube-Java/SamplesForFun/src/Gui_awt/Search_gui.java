package Gui_awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search_gui {

	public static void main(String[] args) {
		Frame window = new Frame();
		FlowLayout fl = new FlowLayout();
		Label lbl1 = new Label("n1");
		Label lbl2 = new Label(" n2");
		Label lbl3 = new Label("Result");
		TextField txt_fld = new TextField(10);
		TextField txt_fld2= new TextField(10);
		TextField txt_fld3= new TextField(10);
		Button btn = new Button("Add");
		
		window.setLayout(fl);
		window.add(lbl1);
		window.add(txt_fld);
		window.add(lbl2);
		window.add(txt_fld2);
		window.add(lbl3);
		window.add(txt_fld3);
		window.add(btn);
		window.setResizable(false);
		
		window.setSize(300,400);
		window.setVisible(true);
		
		class MyListener implements ActionListener {
			public void actionPerformed (ActionEvent ae) {
				String s1 = txt_fld.getText();
				String s2 = txt_fld2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				int res = n1 + n2;
				
				txt_fld3.setText(String.valueOf(res));
			}
		}
	}

}
