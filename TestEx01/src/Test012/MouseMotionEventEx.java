package Test012;

import java.awt.*;
import java.awt.event.*;

public class MouseMotionEventEx extends Frame implements MouseMotionListener{
	public MouseMotionEventEx() {
		super("Move Test");
		addMouseMotionListener(this);
		setSize(300,200);
		setVisible(true);
	}
	public void mouseMoved(MouseEvent e) {
		if(e.getSource()==this)
			System.out.println("X ="+e.getX()+", Y= "+e.getY());
	}
	public void mouseDragged(MouseEvent e) {
		if(e.getSource()== this)
			System.out.println("X ="+e.getX()+", Y= "+e.getY());
	}
	public static void main(String[] ar) {
		new MouseMotionEventEx();
	}
}
