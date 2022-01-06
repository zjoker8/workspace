package Test007;

import java.awt.*;
import java.awt.event.*;

public class ActionEventEx1 extends Frame implements ActionListener{
	private TextField tf = new TextField(10);
	ActionEventEx1(){
		super("ActionEventEx1");
		setLayout(new FlowLayout());
		add(tf);
		tf.addActionListener(this);
		setSize(300,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf) {
			String imsi = tf.getText();
			System.out.println("¸Þ¼¼Áö : "+imsi);
			tf.setText("");
		}
	}
	public static void main(String[] ar) {
		new ActionEventEx1();
	}
}
