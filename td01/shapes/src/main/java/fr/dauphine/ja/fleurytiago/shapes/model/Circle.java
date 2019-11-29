package fr.dauphine.ja.fleurytiago.shapes.model;

import java.util.List;

public class Circle extends Shape{
	protected Point center;
	protected double radius;
	
	
	public Circle() {
		center = new Point();
		radius = 1;
	}
	public Circle(Point center, double rad) {
		this.center = center;
		this.radius = rad;
	}
	
	public void translate(int dx, int dy) {
		center.translate(dx,  dy);
	}
	
	@Override
	public String toString() {
		return center+"  R="+radius+"   S="+surface();
	}
	
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.translate(3, -6);
		System.out.println(c);
	}
	
	public double surface() {
		return ((double)Math.round(Math.PI*radius*radius*100))/100;
		
	}
	
	public boolean contains(Point p) {
		if(Math.sqrt(Math.pow(center.getX()-p.getX(),2) + Math.pow(center.getY()-p.getY(),2)) <= radius  )return true;
		else return false;
	}
	
	public static void test() {
		
	}
	
	
	public static boolean contains(Point p, List<Object> circles) {
		for(Object o : circles) {
			Circle c = new Circle();
			if(o.getClass().equals(c.getClass())) {
				c = (Circle)o;
				if(c.contains(p))return true;
			}
			
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj.getClass().equals(this.getClass())) {
//		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			return (center.equals(c.getCenter()) && radius == c.getRadius() );
		}
		return super.equals(obj);
	}
	
	//GETTER
	public Point getCenter() {
		return center.clone();
	}
	public double getRadius() {
		return radius;
	}
}
