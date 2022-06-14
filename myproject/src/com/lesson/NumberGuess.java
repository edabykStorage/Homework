package com.lesson;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int counterLife = 6;
		int counterGame = 0;
		String tempStr;

		System.out.println("Say� bulma oyununa ho�geldiniz.");
		System.out.println(" ");

		System.out.println("Hak say�n�z: " + counterLife);
		System.out.println(" ");

		if (counterGame == 0) {
			System.out.println("Bu oyunu ilk kez oynuyorsunuz");
		} else {
			System.out.println("Bu oyunu daha �nce " + counterGame + " kez oynad�n�z");
		}
		System.out.println(" ");
		System.out.println("--------------Men�--------------");
		System.out.println(" ");
		System.out.println("Oyuna ba�lamak i�in ->1<- e bas�n�z ");
		System.out.println(" ");
		System.out.println("��k�� i�in ->2<- ye bas�n�z ");

		int menuSelect = inp.nextInt();

		while (menuSelect != 1 && menuSelect != 2) {
			System.out.println("Yanl�� bir se�im yapt�n�z .L�tfen tekrar se�im yap�n�z");
			menuSelect = inp.nextInt();
		}

		if (menuSelect == 1) {

			int randomNumber = (int) (Math.random() * 100);

			System.out.println("Sistem sizin i�in 1'den 100'e rasgele bir say� se�ti.");
			System.out.println(" ");

			for (int i = 1; i < 7; i++) {
				System.out.print(i + " .tahmininizi giriniz: ");
				System.out.println(" ");
				System.out.println("Kalan hakk�n�z: " + counterLife);
				int numSelect = inp.nextInt();

				if (counterLife == 1) {
					System.out.println("Kaybettiniz. Sistemin tuttu�u say�:" + randomNumber);
					break;
				}

				if (randomNumber > numSelect && randomNumber - numSelect < 11) {
					System.out.println("Yakla�t�n�z , artt�r�n");
					counterLife--;
				} else if (randomNumber > numSelect && randomNumber - numSelect > 11) {
					System.out.println("uzaks�n�z , artt�r�n");
					counterLife--;
				} else if (randomNumber < numSelect && numSelect - randomNumber < 11) {
					System.out.println("Yakla�t�n�z , azalt�n");
					counterLife--;
				} else if (randomNumber < numSelect && numSelect - randomNumber > 11) {
					System.out.println("uzaks�n�z , azalt�n");
					counterLife--;
				} else {
					System.out.println("Tebrikler,Kazand�n�z");
					System.out.println(" ");
					System.out.println(i + " . seferde do�ru tahmin yapt�n�z");
					break;
				}

				System.out.println(" ");
			}
		} else if (menuSelect == 2) {
			System.out.println("��k�� yapt�n�z.");
		}

	}

}