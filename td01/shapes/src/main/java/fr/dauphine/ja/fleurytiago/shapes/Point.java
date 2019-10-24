package fr.dauphine.ja.fleurytiago.shapes;

import java.util.ArrayList;

public class Point {
	
	private Integer x;
	private Integer y;
	public static int numberOfPoints=0;
	
	///CONSTRUCTEURS
	
	public Point(int x, int y) {
		numberOfPoints++;
		this.x=x;
		this.y=y;
	}
	
	public Point() {
		numberOfPoints++;
		x=0;
		y=0;
	}
	
	public Point(Point p) {
		numberOfPoints++;
		x = p.getX().intValue();
		y = p.getY().intValue();
	}
	
	
    public static void main( String[] args ){
    	
    	Point p1=new Point(1,2);
    	Point p2=p1;
    	Point p3=new Point(1,2);
    	ArrayList<Point> list = new ArrayList<>();
    	list.add(p1);
    	System.out.println(list.indexOf(p2));
    	System.out.println(list.indexOf(p3));
    	
    }
    
    
    
    public void translate(int dx, int dy) {
    	x+=dx;
    	y+=dy;
    }
    
    
    public Point clone() {
    	return new Point(this);
    }
    
    
    
    @Override
    public String toString() {
    	return "("+x.toString()+";"+y.toString()+")";
    }
    
    @Override
    public boolean equals(Object o) {
    	if(o instanceof Point) {
    		Point p = (Point) o;
			if(p.getX().intValue() == x.intValue() && p.getY().intValue() == y.intValue() )return true;
			
    	}
    	return false;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    //ACCESSEURS
    
    public Integer getX() {
		return x;
	}
    public Integer getY() {
		return y;
	}
    
    //MUTATEURS
    
    public void setX(Integer x) {
		this.x = x;
	}
    public void setY(Integer y) {
		this.y = y;
	}
}
