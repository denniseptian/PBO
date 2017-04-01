package com.modul1.question4;

import java.util.Scanner;

public class Matrices {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan jumlah kolom : ");
		int kolom = scan.nextInt();
		System.out.println("Masuukan jumlah baris : ");
		int baris = scan.nextInt();
		int[][] matrikPenjumlahanKolom = new int[baris][kolom];
		int[] hasilKolomMatrix = new int[kolom];
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.println("Masukkan angka pada baris " + i + " Kolom " + j + " : ");
				matrikPenjumlahanKolom[i][j] = scan.nextInt();
			}
		}
		System.out.println("\n--------------------------\n");
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print(matrikPenjumlahanKolom[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("--------------------------\n");
		for (int i = 0; i < kolom; i++) {
			for (int j = 0; j < baris; j++) {
				hasilKolomMatrix[i] = hasilKolomMatrix[i] + matrikPenjumlahanKolom[j][i];
			}
			System.out.print(hasilKolomMatrix[i] + "\t");
		}
		scan.close();
	}
}