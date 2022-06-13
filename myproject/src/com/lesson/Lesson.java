package com.lesson;

import java.util.Scanner;

public class Lesson {

	public static void main(String[] args) {

		// Question 1 : Prime Number
		// if number is prime result will be true, else result will be false.

		Scanner inp = new Scanner(System.in);

		System.out.print("Say� giriniz: ");
		int num = inp.nextInt();
		int mod;
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			mod = num % i;
			if (mod == 0) {
				isPrime = false;
				break;
			}

		}
		System.out.println(isPrime);

		System.out.println("------------------------------------------------------------------");

		// Question 2 : Mod
		System.out.print("�lk say�y� giriniz (ilk say� % ikinci say�): ");
		int number1 = inp.nextInt();
		System.out.println(" ");

		System.out.print("�kinci say�y� giriniz (ilk say� % ikinci say�): ");
		int number2 = inp.nextInt();

		System.out.println(" ");

		System.out.println(number1 + " % " + number2 + " = " + number1 % number2);

		System.out.println("------------------------------------------------------------------");

		// 3. Question :

		int myNumber = 6527;
		int tempNumber = myNumber;

		System.out.println("6527 say�s� i�erisinden bir rakam giriniz");
		int otherNumber = inp.nextInt();
		int counter = 0;
		int modResult = 0;
		;
		do {

			modResult = myNumber % 10;
			if (modResult == otherNumber) {
				System.out.println(" ");
				System.out.println("Girdi�iniz say� " + Math.pow(10, counter) + " ler basama��ndad�r.");
				System.out.println(" ");
				for (int i = 1; i < 5; i++) {
					int tempMod = tempNumber % 10;
					System.out.println("Say�n�n " + i + ". basama��nda " + tempMod + " vard�r.");
					tempNumber /= 10;
				}

			} else {
				myNumber /= 10;
				counter++;
			}
		} while (modResult != otherNumber);

		inp.close();
	}
}