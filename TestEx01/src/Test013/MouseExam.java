package Test013;

import java.awt.*;
import java.awt.event.*;

public class MouseExam extends Frame implements MouseListener{
	private Button bt= new Button("ธÞที");
	public MouseExam() {
		super("Mouse Game");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(bt);
		bt.addMouseListener(this);
		setSize(600,600);
		setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==bt) {
			int x= (int)(Math.random()*540+10);
			int y= (int)(Math.random()*520+10);
			bt.setLocation(x,y);
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {}
	public static void main(String[] ar) {
		new MouseExam();
	}
}
