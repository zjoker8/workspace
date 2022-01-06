package Test004;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventEx2 extends Frame implements WindowListener{

	private static final long serialVersionUID = 1L;

	public WindowEventEx2() {
		super("EventEx2");
		addWindowListener(this);
		setSize(300,200);
		setVisible(true);
	}
	public void windowOpened(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String[] ar) {
		new WindowEventEx2();
	}
}
