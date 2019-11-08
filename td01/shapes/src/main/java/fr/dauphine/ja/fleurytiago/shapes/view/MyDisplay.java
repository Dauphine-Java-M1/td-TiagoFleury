package fr.dauphine.ja.fleurytiago.shapes.view;

import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel {

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
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avance - Graphic Display");   //
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}

}
