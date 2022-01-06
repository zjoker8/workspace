package Test005;

import java.awt.*;
import java.awt.event.*;

import Test003.WinEvent;

public class WindowEventEx3 extends Frame{
	public WindowEventEx3() {
		super("EventEx3");
		addWindowListener(new WinEventEx());
		setSize(300,200);
		setVisible(true);
	}
	class WinEventEx extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	public static void main(String[] ar ) {
		new WindowEventEx3();
	}
}
