package com.modul1.question5;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan text : ");
		String insertedText = scan.nextLine();
		System.out.print("\nBoso walikan : ");
		for (int i = insertedText.length() - 1; i >= 0; i--) {
			System.out.print(insertedText.charAt(i));
		}
		scan.close();
	}
}