package com.modul3.question1;

import java.util.Scanner;

public class Start {
	private static Scanner scan;

	public static void main(String args []){
		scan = new Scanner(System.in);
		int pilih;
		do {
			System.out.println("Select want to show!");
			System.out.println("1. Show BukuTA\n2. Show BukuText\n3. Hitung Denda\n4. Hitung biaya copy.");
			pilih = scan.nextInt();
			BukuTA bukuTA = new BukuTA("2014160", "Pdi kala yang senja ini banyak");
			BukuTeks bukuTeks = new BukuTeks("UMM Press", "Dikala malam tiba", "John C martin");
			switch (pilih) {
			case 1:				
				System.out.println(bukuTA.showKode());
				break;
			case 2:				
				System.out.println(bukuTeks.showKode());
				break;
			case 3:
				bukuTeks.meminjam(14, 03, 2017);
				System.out.println("denda yang harus di bayar : "+bukuTeks.hitungDenda());
				if(bukuTeks.hitungDenda() != 0){
					System.out.println("Denda yang harus di bayar : "+bukuTeks.hitungDenda());
				}else{
					System.out.println("Peminjman tidak terkena denda.");
				}
				break;
			case 4:
				System.out.println("Biaya copy bukuTA : "+bukuTA.hitungBiayaKopi(24));
				System.out.println("Biaya copy bukuTA : "+bukuTeks.hitungBiayaKopi(24));
			default:
				break;
			}
			
			System.out.println("Back? (y/n)");
			
			String acceptable = scan.next();
			if(acceptable.equals("y")){
			}
			
		} while (true);
	}
}
