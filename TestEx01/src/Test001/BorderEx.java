package Test001;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class BorderEx extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label a,b,c,d,e;
	public BorderEx(){
		super("알록달록");
		setLayout(new BorderLayout(5,5));
		a= new Label("위",Label.CENTER);
		b= new Label("아래",Label.CENTER);
		c= new Label("왼",Label.CENTER);
		d= new Label("오",Label.CENTER);
		e= new Label("중",Label.CENTER);
	
		setBackground(Color.gray);
		a.setBackground(Color.red);
		b.setBackground(Color.blue);
		c.setBackground(Color.magenta);
		d.setBackground(Color.black);
		e.setBackground(Color.orange);
		
		a.setForeground(Color.blue);
		b.setForeground(Color.red);
		c.setForeground(Color.yellow);
		d.setForeground(Color.white);
		e.setForeground(Color.white);

		add("North",a);
		add("South",b);
		add("West",c);
		add("East",d);
		add(e,BorderLayout.CENTER);

		setSize(300,300);
		
		setVisible(true);

	}
	public static void main(String[] ar){
		new BorderEx();
	}

	
	
	
	
}
