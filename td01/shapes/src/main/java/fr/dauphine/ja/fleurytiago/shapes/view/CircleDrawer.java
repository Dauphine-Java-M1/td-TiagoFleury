package fr.dauphine.ja.fleurytiago.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.fleurytiago.shapes.model.Circle;

public class CircleDrawer implements Drawer{
	
	private Circle circle;
	
	public CircleDrawer(Circle c) {
		this.circle = c;
	}

	@Override
	public void drawShape(Graphics g) {
		g.drawOval(circle.getCenter().getX(), circle.getCenter().getY(), (int)circle.getRadius()*2, (int)circle.getRadius()*2);
		
	}
	
	
	
}
