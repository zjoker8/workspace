package Test001;

import java.awt.*;

public class TestEx1 extends Frame{
	Label a,b,c;
	public TestEx1(){
			super("콘솔창");
			
			a = new Label("a다라라라라라",Label.CENTER);
			b = new Label("b다",Label.CENTER);
			c = new Label("c다",Label.CENTER);
			
			a.setBackground(Color.blue);
			b.setBackground(Color.green);
			c.setBackground(Color.cyan);
			a.setForeground(Color.white);
			b.setForeground(Color.white);
			c.setForeground(Color.white);
			
			add("North",a);
			add("East",b);
			add("Center",c);
			setLocation(300,300);
			setVisible(true);
			
	}
	public static void main(String[] ar) {
		TestEx1 ex = new TestEx1();
	
	}
}
	

