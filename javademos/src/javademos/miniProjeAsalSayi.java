package javademos;

import java.util.Scanner;

public class miniProjeAsalSayi {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);

		int sayi,sayac=0;

		System.out.print("Say�: ");
		sayi = giris.nextInt();

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				sayac++;
				break;
			}
		}
		
		if(sayac==0)
			System.out.println("Say� asald�r.");
		else
			System.out.println("Say� asal de�ildir.");
		
		
	}

}
