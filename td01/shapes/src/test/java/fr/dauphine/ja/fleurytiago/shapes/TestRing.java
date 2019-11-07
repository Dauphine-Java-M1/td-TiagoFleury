package fr.dauphine.ja.fleurytiago.shapes;

import junit.framework.TestCase;

public class TestRing extends TestCase {
	
	public void testEquals() {
		Point p = new Point(2,2);
		Ring r = new Ring(p.clone(),4,3);
		
		Ring r2 = new Ring(p.clone(),4,3);
		
		assertTrue(r.equals(r2));
	}
	
}
