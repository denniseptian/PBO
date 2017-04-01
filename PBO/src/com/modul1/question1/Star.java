package com.modul1.question1;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		boolean menu = true;
		while (menu) {
			System.out.print("Masukkan nilai x =");
			x = scan.nextInt();
			System.out.println("\nCetak Segitiga Siku-siku");
			System.out.println("==========================");
			for (int i = 1; i <= x; i++) {
				// Membuat spasi
				for (int j = x - 1; j >= i; j--) {
					System.out.print(" ");
				}
				// Membuat bintang
				for (int k = 1; k <= i; k++) {
					System.out.print(" *");
				}
				System.out.println();
			}
			System.out.print("\nIngin Mencoba lagi (Y/N) ?:");
			String cek = scan.next();
			if (cek.equalsIgnoreCase("N")) {
				menu = false;
			} else if (cek.equalsIgnoreCase("Y")) {
				menu = true;
			} else {
				System.exit(0);
			}
		}
		scan.close();
	}
}