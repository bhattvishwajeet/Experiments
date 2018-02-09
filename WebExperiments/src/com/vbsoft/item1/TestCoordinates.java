package com.vbsoft.item1;

public class TestCoordinates {

	public static void main(String args) throws Exception{
		
		Coordinates myCoordinates = Coordinates.getInstanceFromXY(1, 2);
		System.out.println("MY XY Coordinates:"+myCoordinates.getX());
		System.out.println("MY XY Coordinates:"+myCoordinates.getY());
		System.out.println("-----------------");
		myCoordinates = Coordinates.getInstanceFromPolarXY(1, 2);
		System.out.println("MY XY PolarCoordinates:"+myCoordinates.getX());
		System.out.println("MY XY PolarCoordinates:"+myCoordinates.getY());
		
		
		
	}
	
}
