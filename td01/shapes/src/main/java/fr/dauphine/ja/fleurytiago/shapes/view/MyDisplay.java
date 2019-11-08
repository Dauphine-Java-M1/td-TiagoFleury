package fr.dauphine.ja.fleurytiago.shapes.view;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("deprecation")
public class MyDisplay extends JPanel implements Observer{

	public MyDisplay() {
	}

	public MyDisplay(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public MyDisplay(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MyDisplay(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void paintComponent(Graphics g) {
		System.out.println("fonction appelée.");
		g.drawLine(0, 250, 700, 250);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avance - Graphic Display");   //
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		
		
	}

}
