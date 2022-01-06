package Test008;

import java.awt.*;
import java.awt.event.*;

public class ActionEventEx2 extends Frame implements ActionListener{
	private Button bt = new Button("»Æ¿Œ");
	ActionEventEx2(){
		super("ActionEventEx2");
		bt.addActionListener(this);
		setLayout(new FlowLayout());
		add(bt);
		setSize(300,200);
		setVisible(true);		
	}
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	public static void main(String[] ar) {
		new ActionEventEx2();
	}

}
