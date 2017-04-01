package com.modul3.question2b;


public class ATMBankDamai implements CashAble {
	private String kodeTransaksi;
	private java.util.Date tanggalTransaksi;

	public ATMBankDamai(String kodeTransaksi, java.util.Date date) {
		setTanggalTransaksi(date);
		setKodeTransaksi(kodeTransaksi);
	}

	public String getKodeTransaksi() {
		return kodeTransaksi;
	}

	public void setKodeTransaksi(String kodeTransaksi) {
		this.kodeTransaksi = kodeTransaksi;
	}

	public java.util.Date getTanggalTransaksi() {
		return tanggalTransaksi;
	}

	public void setTanggalTransaksi(java.util.Date date) {
		this.tanggalTransaksi = date;
	}

	@Override
	public void keluarkanUang(int nominal) {
		// TODO Auto-generated method stub
		int totalUangYangDiDapat = 0;
		if ((nominal % 5000) == 0) {
			for(int i = 0 ; i < 3 ; i++){
				if(nominal != 0){
					if (nominal >= 50000) {
						totalUangYangDiDapat = nominal / 50000;
						nominal = nominal % 50000;
						System.out.print("Memperoleh uang 50,000 Sebanyak "+totalUangYangDiDapat);
					} else if (nominal >= 20000) {
						totalUangYangDiDapat = nominal / 20000;
						nominal = nominal % 20000;
						System.out.print("Memperoleh uang 20,000 Sebanyak "+totalUangYangDiDapat);
					} else if (nominal >= 5000) {
						totalUangYangDiDapat = nominal / 5000;
						nominal = nominal % 5000;
						System.out.print("Memperoleh uang 5,000 Sebanyak "+totalUangYangDiDapat);
					}
				}
				System.out.print(" ");
			}
		} else {
			System.out.println("Tidak bisa mengeluarkan uang tersebut!");
		}
	}
}
