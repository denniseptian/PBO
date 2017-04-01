package com.modul2.question3;

public class Enkapsulasi {
	public void encapsulasi(){
		manusia manusiaHidup = new manusia();
		manusiaHidup.setNama("Denni septian");
		manusiaHidup.setJenisKelamin("Laki-Laki");
		manusiaHidup.setAlamat("Kepanjen");
		
		System.out.println("Nama : "+manusiaHidup.getNama());
		System.out.println("Jenis Kelamin : "+manusiaHidup.getJenisKelamin());
		System.out.println("Alamat : "+manusiaHidup.getAlamat());
	}
	
	/*
	public void initialization(){
		manusia manusiaHidup = new manusia();
		manusiaHidup.nama = "dennis";
		manusiaHidup.jenisKelamin = "laki";
		manusiaHidup.alamat = "kepanjen";
	}

	 */
}
