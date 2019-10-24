package fr.dauphine.ja.fleurytiago.shapes;

import java.util.LinkedList;
import java.util.Objects;

public class LigneBrisee {
	private LinkedList<Point> points;
	
	public LigneBrisee() {
		points = new LinkedList<Point>();
	}
	
	
	public void add(Point p) {
		Objects.requireNonNull(p);
		points.add(p);
	}
	
	
	public int nbPoints() {
		return points.size();
	}
	
	public boolean contains(Point p) {
		return points.contains(p);
	}
	//Commentaire inutile.
	
	public static void main(String[] args) {
		LigneBrisee ligne = new LigneBrisee();
		ligne.add(new Point(0,0));
		ligne.add(new Point(0,3));
		ligne.add(new Point(0,5));
		ligne.add(new Point(3,0));
		try {
			ligne.add(null);
		}catch(NullPointerException e) {
			System.out.println("Interdit d'ajouter null.");
		}
		System.out.println(ligne.contains(new Point(3,0)));
		Circle C = new Circle(new Point(0,0),4);
		System.out.println("contient ? "+C.contains(new Point(3,1)));
	}
}
