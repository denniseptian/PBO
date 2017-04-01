package com.modul2.question1;

public class OverloadingConstructor {
	public void Overload(){
		Orang orang = new Orang();
		System.out.println("Nama : "+orang.getNama());;
		System.out.println("NIM : "+orang.getNIM());
		System.out.println("Status : "+orang.getStatus());
		
		Orang pegawai = new Orang("septian", "Pegawai", "099", "bekerja");
		System.out.println("Nama : "+pegawai.getNama());;
		System.out.println("NIM : "+pegawai.getNIP());
		System.out.println("Status : "+pegawai.getStatus());
		
		Orang orang1 = new Orang("denni septian", 2014160, "Aktif");
		System.out.println("Nama : "+orang1.getNama());;
		System.out.println("NIM : "+orang1.getNIM());
		System.out.println("Status : "+orang1.getStatus());
	}
}
