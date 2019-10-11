package fr.dauphine.ja.fleurytiago.td00;
import java.util.ArrayList;
import java.lang.Math;

/**
 * Hello world!
 *
 */
public class PrimeCollection {
	private ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		numbers = new ArrayList<Integer>();
	}
	
	
	public void initRandom(int n, int m) {
		java.util.Random randomGenerator = new java.util.Random();
		for(int i=0;i<n;i++) {
			numbers.add( (Integer)randomGenerator.nextInt(m) );
		}
	}
	
	public static boolean isPrime(int p) {
		if(p == 0)return true;
		if(p == 1)return false;
		for(int i=2;i<=Math.sqrt(p);i++) {
			if(p%i == 0)return false;
		}
		return true;
	}
	
	public void printPrimes() {
		for(Integer n:numbers) {
			if(isPrime(n))System.out.print(n+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		PrimeCollection test = new PrimeCollection();
		test.initRandom(100, 2000);
		test.printPrimes();
	}
	
	
	public java.util.ArrayList<Integer> getNumbers() {
		return numbers;
	}
	public void setNumbers(java.util.ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}
}
