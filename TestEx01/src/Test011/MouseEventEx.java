package Test011;

import java.awt.*;
import java.awt.event.*;

public class MouseEventEx extends Frame implements MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Button bt = new Button("가나다");
	private Button bt1 = new Button("가나다");
	public MouseEventEx() {
		super("Mouse Test");
		setLayout(new FlowLayout());
		add(bt);
		add(bt1);
		setEvent();
		setSize(300,200);
		setVisible(true);
	}
	public void setEvent() {
		bt.addMouseListener(this);
		bt1.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==bt)System.out.println("가나다");
	}
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==bt1) System.out.println("가나다");
	}
	public void mouseReleased(MouseEvent e) {
		if(e.getSource()==bt1)
			System.out.println("가나다라");
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==bt || e.getSource()==bt1)
				System.out.println("가나다");
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==bt || e.getSource()==bt1)
			System.out.println("가나다");
	}
	public static void main(String[] ar) {
		new MouseEventEx();
	}
	
}
