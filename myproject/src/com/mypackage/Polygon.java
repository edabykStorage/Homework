package com.mypackage;

import java.util.Scanner;

public class Polygon {
	public static void main(String[] args) {
		/*
		 * Following code gives us only hexagon's area. the formula of the area of the
		 * is: ns^2/(4tan(π/n)) n=numberOfEdges s=sideLenght
		 */

		// Defining variables
		double numberOfEdges = 6;
		double sideLenght = 10;
		double area;

		area = (numberOfEdges * sideLenght * sideLenght)
				/ (4 * ((Math.sin(Math.PI / numberOfEdges)) / (Math.cos(Math.PI / numberOfEdges))));
		System.out.println("The area of the hexagon: " + area + " cm^2");

		System.out.println("------------------------------------------------------------------------");

		// We can use the following improved code to write the program with different
		// number of edges.

		System.out.println("Welcome to the program that calculates polygons area!");
		System.out.println(" ");
		calculation();
	}

	public static void calculation() {
		Scanner inpScanner = new Scanner(System.in);
		System.out.println("Please enter the number of sides of the polygon you want to calculate.");
		double numberOfE = inpScanner.nextDouble();
		System.out.println(" ");
		System.out.println("Please enter the side length of the polygon you want to calculate.(cm)");
		double sideL = inpScanner.nextDouble();
		double area2;

		area2 = (numberOfE * sideL * sideL) / (4 * ((Math.sin(Math.PI / numberOfE)) / (Math.cos(Math.PI / numberOfE))));

		System.out.println(" ");
		System.out.println("The area of the polygon with " + (int) numberOfE + " edge is: " + area2 + " cm^2.");
		System.out.println(" ");

		while (true) {
			System.out.println("Press ->Y<- to calculate another polygon.\r\n" + "Press ->E<- to exit.");
			String desicion = inpScanner.next();
			if (desicion.equals("E")) {
				System.out.println(" ");
				System.out.println("You logged out. Thanks for using!");
				inpScanner.close();
				break;
			} else if (desicion.equals("Y")) {
				calculation();
			} else {
				System.out.println(" ");
				System.out.println("You entered a wrong data, please select again.");
				System.out.println(" ");
			}
		}
	}

}