package Test003;

import java.awt.*;

public class WindowEventEx1 {
	public static void main(String[] ar) {
		Frame f = new Frame("EventEx1");
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		f.setSize(300,200);
		f.setVisible(true);
		
	}
}
