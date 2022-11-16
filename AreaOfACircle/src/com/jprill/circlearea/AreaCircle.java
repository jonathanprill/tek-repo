package com.jprill.circlearea;

public class AreaCircle {
	
	public static double area;
	public static double radius;
	public static double pi = 3.14;

	public static void main(String[] args) {
		calcArea(2.25, 3.14);
		displayArea();
	}
	
	public static double calcArea(double radius, double pi) {
		area = pi*(radius * radius);
		return area;
	}
	
	public static void displayArea() {
		System.out.println(area);
	}

}
