package fr.dauphine.ja.fleurytiago.shapes.view;

import java.awt.Graphics;
import java.awt.LayoutManager;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.fleurytiago.shapes.model.World;

@SuppressWarnings("deprecation")
public class MyDisplay extends JPanel implements Observer{

	
	private World world;
	
	
	public MyDisplay() {
		super();
	}
	
	public MyDisplay(World world) {
		super();
		this.world = world;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		System.out.println("fonction appelée.");
		g.drawLine(0, 250, 700, 250);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avance - Graphic Display");   
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}

	
	
	@Override //Appelee a chaque fois qu'il y a une notif de l'observé
	public void update(Observable arg0, Object arg1) {
		
		repaint();
	}

}
