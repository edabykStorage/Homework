package com.lesson;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int counterLife = 6;
		int counterGame = 0;
		String tempStr;

		System.out.println("Sayý bulma oyununa hoþgeldiniz.");
		System.out.println(" ");

		System.out.println("Hak sayýnýz: " + counterLife);
		System.out.println(" ");

		if (counterGame == 0) {
			System.out.println("Bu oyunu ilk kez oynuyorsunuz");
		} else {
			System.out.println("Bu oyunu daha önce " + counterGame + " kez oynadýnýz");
		}
		System.out.println(" ");
		System.out.println("--------------Menü--------------");
		System.out.println(" ");
		System.out.println("Oyuna baþlamak için ->1<- e basýnýz ");
		System.out.println(" ");
		System.out.println("Çýkýþ için ->2<- ye basýnýz ");

		int menuSelect = inp.nextInt();

		while (menuSelect != 1 && menuSelect != 2) {
			System.out.println("Yanlýþ bir seçim yaptýnýz .Lütfen tekrar seçim yapýnýz");
			menuSelect = inp.nextInt();
		}

		if (menuSelect == 1) {

			int randomNumber = (int) (Math.random() * 100);

			System.out.println("Sistem sizin için 1'den 100'e rasgele bir sayý seçti.");
			System.out.println(" ");

			for (int i = 1; i < 7; i++) {
				System.out.print(i + " .tahmininizi giriniz: ");
				System.out.println(" ");
				System.out.println("Kalan hakkýnýz: " + counterLife);
				int numSelect = inp.nextInt();

				if (counterLife == 1) {
					System.out.println("Kaybettiniz. Sistemin tuttuðu sayý:" + randomNumber);
					break;
				}

				if (randomNumber > numSelect && randomNumber - numSelect < 11) {
					System.out.println("Yaklaþtýnýz , arttýrýn");
					counterLife--;
				} else if (randomNumber > numSelect && randomNumber - numSelect > 11) {
					System.out.println("uzaksýnýz , arttýrýn");
					counterLife--;
				} else if (randomNumber < numSelect && numSelect - randomNumber < 11) {
					System.out.println("Yaklaþtýnýz , azaltýn");
					counterLife--;
				} else if (randomNumber < numSelect && numSelect - randomNumber > 11) {
					System.out.println("uzaksýnýz , azaltýn");
					counterLife--;
				} else {
					System.out.println("Tebrikler,Kazandýnýz");
					System.out.println(" ");
					System.out.println(i + " . seferde doðru tahmin yaptýnýz");
					break;
				}

				System.out.println(" ");
			}
		} else if (menuSelect == 2) {
			System.out.println("Çýkýþ yaptýnýz.");
		}

	}

}