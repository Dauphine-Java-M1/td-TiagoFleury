package fr.dauphine.ja.fleurytiago.shapes;

public class LigneBrisee {
	private Point[] points;
	private int in;
	
	public LigneBrisee() {
		in=0;
		points = new Point[0];
	}
	
	public LigneBrisee(int tailleMax) {
		in=0;
		points = new Point[tailleMax];
	}
	
	
	public void add(Point p) {
		if(in>=points.length)
			System.out.println("Dépassement de tableau");
		else points[in++]=p;
	}
}
