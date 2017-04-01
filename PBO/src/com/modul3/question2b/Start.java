package com.modul3.question2b;

public class Start {
	public static void main(String args[]){
		String kodeTrasaksi = "ATM600";
		ATMBankDamai atmBankDamai = new ATMBankDamai(kodeTrasaksi, new java.util.Date(System.currentTimeMillis()));
		System.out.println("== Transaksi ATM BANK DAMAI ==");
		System.out.println("Nomor Transaksi : "+atmBankDamai.getKodeTransaksi()+"\nTanggal Transaksi : "+atmBankDamai.getTanggalTransaksi());
		atmBankDamai.keluarkanUang(465000);
	}
}
