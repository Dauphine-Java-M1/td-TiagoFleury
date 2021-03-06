package fr.dauphine.ja.fleurytiago.shapes.model;

import java.util.List;

public class Ring extends Circle {
	
	private double innerRadius;
	
	
	public Ring() {
		super(); //Centre(0,0) et radius = 1
		innerRadius = 0;
	}

	public Ring(Point center, double rad, double inRad) {
		super(center, rad);
		innerRadius = inRad;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj.getClass().equals(this.getClass())) {
			Ring r = (Ring) obj;

			return (super.equals(new Circle(center, radius)) && innerRadius == r.getInnerRadius());
		}
		return false;
	}
	
	public double getInnerRadius() {
		return innerRadius;
	}
	
	@Override
	public boolean contains(Point p) {
		
		if(!super.contains(p))return false;
		double tmp = radius;
		radius = innerRadius;
		
		if(super.contains(p))return false;
		return true;
	}
	
	
	public static boolean contains(Point p, List<Object> rings) {
		for(Object o : rings) {
			Ring r = new Ring();
			if(o.getClass().equals(r.getClass())) r = (Ring)o;
			if(r.contains(p))return true;
		}
		return false;
	}
	
	
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return super.surface() - (new Circle(center, innerRadius)).surface();
	}
	
	@Override
	public String toString() {
		
		return center+"  R="+radius+"   R2="+innerRadius+"   S="+surface();
	}
	
	public static void main(String[] args) {
		Ring r1 = new Ring(new Point(2,3),5,4);
		System.out.println(r1);
	}
	

}
