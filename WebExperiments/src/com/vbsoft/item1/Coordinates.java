package com.vbsoft.item1;
/**
 * This class demonstrates the use of static factory method to return instances of objects
 * @author vishwajeetbhatt
 *
 */
public class Coordinates {
	
	private double x;
	private double y;
	
	public Coordinates() {}

	public Coordinates(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	
	public static Coordinates getInstanceFromXY(double x, double y) {
		return new Coordinates(x,y);
	}
	
	public static Coordinates getInstanceFromPolarXY(double x, double y) {
		return new Coordinates(x+1, y+1);
	}
	
	
}
