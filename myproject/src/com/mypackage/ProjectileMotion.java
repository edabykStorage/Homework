package com.mypackage;

import java.util.Scanner;

public class ProjectileMotion {

	public static void main(String[] args) {

		// Height and distance calculation program for projectile motion

		double height, angle, initialVelocity, distance, gravity = 9.80;

		Scanner inpScanner = new Scanner(System.in);
		System.out.println("Please enter initial velocity. (m/s)");
		initialVelocity = inpScanner.nextDouble();
		System.out.println(" ");
		System.out.println("Please enter angle.");
		angle = inpScanner.nextDouble();
		System.out.println(" ");

		// The formula of height is (V0^2)*(sin^2(angle))/2g

		height = (Math.pow(initialVelocity, 2) / gravity) * 0.5 * (1 - Math.cos(2 * angle));
		System.out.println("The height is " + height + " m");
		System.out.println(" ");

		/// The formula of flight time is (V0*sin(angle))/10

		Double flightTime = 2 * ((initialVelocity * Math.sin(angle) * -1) / 10);
		System.out.println("The flight time is " + flightTime + " s");
		System.out.println(" ");

		// The formula of vertical velocity is (V0*cos(angle))
		Double verticalVelocity = initialVelocity * Math.cos(angle);
		System.out.println("The vertical velocity is " + verticalVelocity + " m/s");
		System.out.println(" ");

		// The formula of distance is flight time*vertical velocity
		distance = flightTime * verticalVelocity;
		System.out.println("The distance is " + distance + " m");
	}

}
