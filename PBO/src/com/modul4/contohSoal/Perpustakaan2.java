package com.modul4.contohSoal;

import java.util.Scanner;

public class Perpustakaan2 {
	public static void main(String args[]){
		int[] jmlHalaman = new int[3];
		String[] judulSkripsi = new String[3];
		Scanner input = new Scanner(System.in);
		
		try{
			judulSkripsi[0] = "Skripsi 1";
			jmlHalaman[0] = 30;
			judulSkripsi[1] = "Skripsi 2";
			jmlHalaman[1] = 40;
			judulSkripsi[2] = "Skripsi 3";
			jmlHalaman[2] = input.nextInt();
		}catch (java.util.InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		for(int i = 0; i < 3; i++){
			System.out.println(judulSkripsi[i]+" "+jmlHalaman[i]);
		}
		input.close();
	}
}
