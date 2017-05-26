package com.modul4.soal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DaftarBuku {
	
	public static void main(String args []){
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan jumlah buku yang akan di input : ");
		//infoBuku = scan.nextInt();
		KelolaBuku[] kelolaBuku = new KelolaBuku[6];
		
		String ya;
		boolean ulangi = false;
		try{	
			int i = 0;
			do {
				kelolaBuku[i] = new KelolaBuku();
				
				System.out.println("Masukkan Judul buku : ");
				kelolaBuku[i].setJudulBuku(scan.nextLine());
				System.out.println("Masukkan Type buku : ");
				kelolaBuku[i].setTypeBuku(scan.nextLine());
				System.out.println("Masukkan Jumlah halaman : ");
				kelolaBuku[i].setJumlahHalaman(scan.nextInt());
				System.out.println("Masukkan data lagi?");
				ya = scan.next();
				
				if(ya.equals("ya")||ya.equals("y"))
					ulangi = true;
				i++;
			} while (ulangi);
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Masukkan data dengan benar!");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Data yang anda masukkan melebihi batas!");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		for(int n = 0; n < 6; n++){
			if(kelolaBuku[n].getJudulBuku() != null){
				System.out.println("buku ke : "+n);
				System.out.println("Judul buku : "+kelolaBuku[n].getJudulBuku());
				System.out.println("type buku : "+kelolaBuku[n].getTypeBuku());
				System.out.println("Jumlah halaman : "+kelolaBuku[n].getJumlahHalaman());
			}else
				break;
		}
		scan.close();
	}
}
