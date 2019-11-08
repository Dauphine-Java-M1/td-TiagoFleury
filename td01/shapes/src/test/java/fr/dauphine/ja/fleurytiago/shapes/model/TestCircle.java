package fr.dauphine.ja.fleurytiago.shapes.model;

import junit.framework.TestCase;

public class TestCircle extends TestCase {
	
	public void testEquals() {
		Point p = new Point(2,2);
		Circle c1 = new Circle(p.clone(),3);
		Object c2 = new Circle(p.clone(),3);
		Circle c3 = new Circle(p.clone(),4);
		Circle c4 = new Circle(new Point(3,2),3);
		
		assertTrue(c1.equals(c2));
//
		assertTrue(c2.equals(c1));
//		
		assertFalse(c3.equals(c2));
//		
//		
		Ring r = new Ring(p.clone(),3,2);
		assertFalse(c1.equals(r));
//		
//		
		
	}
	
}
