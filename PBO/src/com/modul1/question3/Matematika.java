package com.modul1.question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matematika {
	public class nomor3 {
		/*
		 * Memiliki 6 methode : Pemilihan Menu, Input Angka, dan Operasi angka
		 * (Penjumlahan, Pengurangan, Perkalian, Pembagian).
		 */
		// Methode untuk operasi penjumlahan
		public int tambah(int a, int b) {
			int c = a + b;
			return c;
		}

		// Methode untuk operasi pengurangan
		public int kurang(int a, int b) {
			int c = a - b;
			return c;
		}

		// Methode untuk operasi perkalian
		public int kali(int a, int b) {
			int c = a * b;
			return c;
		}

		// Methode untuk operasi pembagian
		// memilih memakai float karena memungkinkan hasilnya adalah bilangan
		// pecahan
		public float bagi(int a, int b) {
			int c = a / b;
			return c;// mengembalikan nilai c
		}

		// Methode untuk input angka
		public int inputangka() {
			String angka;
			int a2 = 0;
			try {
				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				angka = buffer.readLine();
				a2 = Integer.parseInt(angka);
			} catch (IOException e) {
				System.err.println("Maaf, terjadi kesalahan berikut : " + e);
			}
			return a2;
		}

		// Methode untuk pemilihan menu di kalkulator
		public void pilihmenu(int pilih) {
			int a, b;
			float c;
			switch (pilih) {
			case 1:
				System.out.println("Penjumlahan");
				System.out.println("Angka pertama =");
				a = this.inputangka();
				System.out.println("Angka kedua =");
				b = this.inputangka();
				c = this.tambah(a, b);
				System.out.println("Hasil =" + c);
				break;
			case 2:
				System.out.println("Pengurangan");
				System.out.println("Angka pertama =");
				a = this.inputangka();
				System.out.println("Angka kedua =");
				b = this.inputangka();
				c = this.kurang(a, b);
				System.out.println("Hasil= " + c);
				break;
			case 3:
				System.out.println("Perkalian");
				System.out.println("Angka pertama = ");
				a = this.inputangka();
				System.out.println("Angka kedua = ");
				b = this.inputangka();
				c = this.kali(a, b);
				System.out.println("Hasil = " + c);
				break;
			case 4:
				System.out.println("Pembagian");
				System.out.println("Angka pertama = ");
				a = this.inputangka();
				System.out.println("Angka kedua = ");
				b = this.inputangka();
				c = this.bagi(a, b);
				System.out.println("Hasil = " + c);
				break;
			case 5:
				System.out.println("Terima kasih telah menggunakan program kalkulator sederhana ini.");
				break;
			default:
				System.out.println("Maaf pilihan anda salah. Mohon ulangi lagi.");
			}
		}

		// kata "main" menunjukkan kelas utama
		public void main(String[] args) {
			int pilih;
			// instansiansi objek
			nomor3 kalkulator = new nomor3();
			// Tampilan program
			// Menggunakan do.. while..
			do {
				System.out.println("==== KALKULATOR SANGAT SEDERHANA ====");
				System.out.println("Pilih salah satu menu di bawah ini : ");
				System.out.println("1. Penjumlahan");
				System.out.println("2. Pengurangan");
				System.out.println("3. Perkalian");
				System.out.println("4. Pembagian");
				System.out.println("5. Keluar");
				System.out.println("======================================");
				System.out.println("Pilihan anda? ");
				pilih = kalkulator.inputangka();
				kalkulator.pilihmenu(pilih);
			} while (pilih != 5);
		}
	}
}