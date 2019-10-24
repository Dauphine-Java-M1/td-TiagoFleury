package fr.dauphine.ja.fleurytiago.shapes;

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
		
		if(obj instanceof Ring) {
			Ring r = (Ring) obj;
			return super.equals(r) && innerRadius == r.getInnerRadius();
		}
		if(obj instanceof Circle) {
			Circle c = (Circle) obj;
			return super.equals(c) && innerRadius == 0;
		}
		return false;
	}
	
	public double getInnerRadius() {
		return innerRadius;
	}
	
	
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return super.surface() - (new Circle(center, innerRadius)).surface();
	}
	

}
