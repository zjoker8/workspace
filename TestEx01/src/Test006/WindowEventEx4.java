package Test006;

import java.awt.Frame;
import java.awt.event.*;

public class WindowEventEx4 extends Frame{
	public WindowEventEx4() {
		super("EventEx4");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] ar) {
		new WindowEventEx4();
	}
}
